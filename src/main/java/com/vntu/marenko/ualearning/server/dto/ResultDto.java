package com.vntu.marenko.ualearning.server.dto;

import lombok.Data;

import java.util.List;

@Data
public class ResultDto {

    private int id;

    private UserDto user;

    private TestDto test;

    private boolean submitted;

    private List<AnswerDto> answers;

    private long mark;

    private long numberOfRightAnswers;
}
