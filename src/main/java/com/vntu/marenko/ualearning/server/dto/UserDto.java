package com.vntu.marenko.ualearning.server.dto;

import lombok.Data;

@Data
public class UserDto {

    private String login;

    private String name;

    private String surname;

    private int age;

    private String institution;

    private String email;

    private int rating;
}
