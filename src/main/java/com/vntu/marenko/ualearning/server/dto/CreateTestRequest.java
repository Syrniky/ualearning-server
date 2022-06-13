package com.vntu.marenko.ualearning.server.dto;

import lombok.Data;

import java.util.List;

@Data
public class CreateTestRequest {

    private String nameTest;

    private String descriptionTest;

    private List<CreateQuestionDto> questions;

    private List<Integer> tags;
}
