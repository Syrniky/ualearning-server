package com.vntu.marenko.ualearning.server.dto;

import lombok.Data;

import java.util.List;

@Data
public class PostDto {

    private int id;

    private String text;

    private String timestamp;

    private String login;

    private List<String> likes;
}
