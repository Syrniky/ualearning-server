package com.vntu.marenko.ualearning.server.dto;

import lombok.Data;

import java.util.List;

@Data
public class SubmitResultRequest {

    private String userLogin;

    private int testId;

    List<Integer> answers;
}
