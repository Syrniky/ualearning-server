package com.vntu.marenko.ualearning.server.dto;

import lombok.Data;

@Data
public class ResultDescription {

    private Integer id;

    private Integer testId;

    private String testName;

    private long mark;
}
