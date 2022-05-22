package com.vntu.marenko.ualearning.server.component.impl;

import com.vntu.marenko.ualearning.server.component.MarkComputer;
import com.vntu.marenko.ualearning.server.model.Answer;
import com.vntu.marenko.ualearning.server.model.Result;
import org.springframework.stereotype.Component;

@Component
public class MarkComputerImpl implements MarkComputer {
    @Override
    public long compute(Result result) {
        long totalNumberOfProperAnswers = result.getTest()
                .getQuestions()
                .stream()
                .flatMap(question -> question.getAnswers().stream())
                .filter(Answer::isCorrect)
                .count();
        long numberOfUsersProperAnswers = result.getAnswers()
                .stream()
                .filter(Answer::isCorrect)
                .count();
        return numberOfUsersProperAnswers * 100 / totalNumberOfProperAnswers;
    }
}
