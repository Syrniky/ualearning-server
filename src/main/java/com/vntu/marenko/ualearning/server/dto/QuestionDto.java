package com.vntu.marenko.ualearning.server.dto;

import lombok.Data;

import java.util.List;

@Data
public class QuestionDto {

    private int id;

    private String text;

    private List<AnswerDto> answers;
}
