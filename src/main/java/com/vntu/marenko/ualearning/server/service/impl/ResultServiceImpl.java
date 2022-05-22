package com.vntu.marenko.ualearning.server.service.impl;

import com.vntu.marenko.ualearning.server.dto.ResultDescription;
import com.vntu.marenko.ualearning.server.dto.ResultDto;
import com.vntu.marenko.ualearning.server.dto.SubmitResultRequest;
import com.vntu.marenko.ualearning.server.model.Result;
import com.vntu.marenko.ualearning.server.repository.ResultRepository;
import com.vntu.marenko.ualearning.server.service.ResultService;
import ma.glasnost.orika.MapperFacade;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultServiceImpl implements ResultService {

    private final ResultRepository resultRepository;

    private final MapperFacade mapper;

    public ResultServiceImpl(ResultRepository resultRepository,
                             MapperFacade mapper) {
        this.resultRepository = resultRepository;
        this.mapper = mapper;
    }

    @Override
    public ResultDto getResult(int id) {
        Result resultFromModel = resultRepository.getReferenceById(id);
        return mapper.map(resultFromModel, ResultDto.class);
    }

    @Override
    public ResultDto submitResult(SubmitResultRequest request) {
        Result resultToSave = mapper.map(request, Result.class);
        Result savedResult = resultRepository.save(resultToSave);
        return mapper.map(savedResult, ResultDto.class);
    }

    @Override
    public List<ResultDescription> getResultsForUser(String userId) {
        return mapper.mapAsList(resultRepository.getByUserLogin(userId), ResultDescription.class);
    }
}
