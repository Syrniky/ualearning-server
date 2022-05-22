package com.vntu.marenko.ualearning.server.dto;

import lombok.Data;

import java.util.List;

@Data
public class TestDto {

    private int id;

    private String nameTest;

    List<QuestionDto> questions;
}
