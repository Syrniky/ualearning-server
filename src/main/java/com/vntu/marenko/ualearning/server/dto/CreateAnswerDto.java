package com.vntu.marenko.ualearning.server.dto;

import lombok.Data;

@Data
public class CreateAnswerDto {

    private String text;

    private boolean correct;
}
