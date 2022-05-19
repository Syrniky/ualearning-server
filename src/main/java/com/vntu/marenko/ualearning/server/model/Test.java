package com.vntu.marenko.ualearning.server.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Test {

    @Id
    @Column(name = "idtest")
    private int id;

    @Column(name = "name_test")
    private String nameTest;

    @OneToMany
    @JoinColumn(name = "test_idtest")
    List<Question> questions;
}
