package com.vntu.marenko.ualearning.server.service.impl;

import com.vntu.marenko.ualearning.server.component.MarkComputer;
import com.vntu.marenko.ualearning.server.dto.ResultDescription;
import com.vntu.marenko.ualearning.server.dto.ResultDto;
import com.vntu.marenko.ualearning.server.dto.SubmitResultRequest;
import com.vntu.marenko.ualearning.server.model.Result;
import com.vntu.marenko.ualearning.server.model.User;
import com.vntu.marenko.ualearning.server.repository.ResultRepository;
import com.vntu.marenko.ualearning.server.repository.UserRepository;
import com.vntu.marenko.ualearning.server.service.ResultService;
import ma.glasnost.orika.MapperFacade;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultServiceImpl implements ResultService {

    private final MapperFacade mapper;

    private final ResultRepository resultRepository;

    private final UserRepository userRepository;

    private final MarkComputer markComputer;

    public ResultServiceImpl(ResultRepository resultRepository,
                             MapperFacade mapper, UserRepository userRepository, MarkComputer markComputer) {
        this.resultRepository = resultRepository;
        this.mapper = mapper;
        this.userRepository = userRepository;
        this.markComputer = markComputer;
    }

    @Override
    public ResultDto getResult(int id) {
        Result resultFromModel = resultRepository.getReferenceById(id);
        return mapper.map(resultFromModel, ResultDto.class);
    }

    @Override
    public ResultDto submitResult(SubmitResultRequest request) {
        Result resultToSave = mapper.map(request, Result.class);
        Result savedResult = resultRepository.saveAndFlush(resultToSave);
        User user = userRepository.getReferenceById(request.getUserLogin());
        user.setRating(user.getRating() + markComputer.compute(savedResult));
        userRepository.save(user);
        return mapper.map(savedResult, ResultDto.class);
    }

    @Override
    public List<ResultDescription> getResultsForUser(String userId) {
        return mapper.mapAsList(resultRepository.getByUserLogin(userId), ResultDescription.class);
    }
}
