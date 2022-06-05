package com.vntu.marenko.ualearning.server.dto;

import com.vntu.marenko.ualearning.server.model.Tag;
import lombok.Data;

import java.util.List;

@Data
public class TestDto {

    private int id;

    private String nameTest;

    private List<QuestionDto> questions;

    private List<TagDto> tags;
}
