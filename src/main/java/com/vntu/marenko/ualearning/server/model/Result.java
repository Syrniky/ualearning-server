package com.vntu.marenko.ualearning.server.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Result {

    @Id
    @GeneratedValue
    @Column(name = "idresult")
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_login")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "test_id")
    private Test test;

    private boolean submitted;

    @ManyToMany
    @JoinTable(
            name = "result_has_answer",
            joinColumns = @JoinColumn(name = "result_idresult"),
            inverseJoinColumns = @JoinColumn(name = "answer_idanswer"))
    private List<Answer> answers;
}
