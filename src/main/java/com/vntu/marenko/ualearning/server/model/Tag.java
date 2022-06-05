package com.vntu.marenko.ualearning.server.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Tag {

    @Id
    @GeneratedValue
    @Column(name = "idtag")
    private Integer id;


    private String name;
}
