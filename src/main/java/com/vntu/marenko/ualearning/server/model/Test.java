package com.vntu.marenko.ualearning.server.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Test {

    @Id
    @GeneratedValue
    @Column(name = "idtest")
    private Integer id;

    @Column(name = "name_test")
    private String nameTest;

    @OneToMany
    @JoinColumn(name = "test_idtest")
    private List<Question> questions;

    @ManyToMany
    @JoinTable(
            name = "test_has_tag",
            joinColumns = @JoinColumn(name = "test_idtest"),
            inverseJoinColumns = @JoinColumn(name = "tag_idtag"))
    private List<Tag> tags;
}
