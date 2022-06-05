package com.vntu.marenko.ualearning.server.dto;

import lombok.Data;

@Data
public class UserRequest {

    private String login;

    private String password;

    private String name;

    private String surname;

    private int age;

    private String institution;

    private String email;
}
