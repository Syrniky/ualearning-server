package com.vntu.marenko.ualearning.server.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class User {

    @Id
    private String login;

    private String password;

    private String name;

    private String surname;

    private int age;

    private String institution;

    private String email;

    private long rating;
}
