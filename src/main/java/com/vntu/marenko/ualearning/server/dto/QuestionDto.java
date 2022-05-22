package com.vntu.marenko.ualearning.server.dto;

import com.vntu.marenko.ualearning.server.model.Answer;
import lombok.Data;

import java.util.List;

@Data
public class QuestionDto {

    private int id;

    private List<AnswerDto> answers;
}
