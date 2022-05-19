package com.vntu.marenko.ualearning.server.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Answer {

    @Id
    @Column(name = "idanswer")
    private int id;

    private String text;

    private boolean correct;
}
