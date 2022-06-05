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

    @Column(name = "text_que")
    private String text;

    @OneToMany
    @JoinColumn(name = "question_idquestion")
    private List<Answer> answers;
}
