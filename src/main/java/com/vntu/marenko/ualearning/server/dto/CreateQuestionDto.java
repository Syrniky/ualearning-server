package com.vntu.marenko.ualearning.server.dto;

import lombok.Data;

import java.util.List;

@Data
public class CreateQuestionDto {

    private String text;

    private List<CreateAnswerDto> answers;
}
