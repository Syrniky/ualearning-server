package com.vntu.marenko.ualearning.server.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Question {

    @Id
    @GeneratedValue
    @Column(name = "idquestion")
    private Integer id;

    @OneToMany
    @JoinColumn(name = "question")
    private List<Answer> answers;
}
