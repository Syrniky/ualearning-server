package com.vntu.marenko.ualearning.server.mapper;

import com.vntu.marenko.ualearning.server.dto.SubmitResultRequest;
import com.vntu.marenko.ualearning.server.model.Result;
import com.vntu.marenko.ualearning.server.repository.AnswerRepository;
import com.vntu.marenko.ualearning.server.repository.TestRepository;
import com.vntu.marenko.ualearning.server.repository.UserRepository;
import ma.glasnost.orika.CustomMapper;
import ma.glasnost.orika.MappingContext;
import org.springframework.stereotype.Component;

@Component
public class SubmitResultRequestToDomainMapper extends CustomMapper<SubmitResultRequest, Result> {

    private final UserRepository userRepository;

    private final TestRepository testRepository;

    private final AnswerRepository answerRepository;

    public SubmitResultRequestToDomainMapper(UserRepository userRepository,
                                             TestRepository testRepository,
                                             AnswerRepository answerRepository) {
        this.userRepository = userRepository;
        this.testRepository = testRepository;
        this.answerRepository = answerRepository;
    }

    @Override
    public void mapAtoB(SubmitResultRequest submitResultRequest, Result result, MappingContext context) {
        super.mapAtoB(submitResultRequest, result, context);
        result.setUser(userRepository.getById(submitResultRequest.getUserLogin()));
        result.setTest(testRepository.getById(submitResultRequest.getTestId()));
        result.setAnswers(answerRepository.findAllById(submitResultRequest.getAnswers()));
    }
}
