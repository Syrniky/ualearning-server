package com.vntu.marenko.ualearning.server.dto;

import lombok.Data;

@Data
public class CreatePostRequest {

    private String text;

    private String username;
}
