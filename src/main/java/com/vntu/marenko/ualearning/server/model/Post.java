package com.vntu.marenko.ualearning.server.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Post {

    @Id
    @GeneratedValue
    @Column(name = "idpost")
    private Integer id;

    private String text;

    private Date timestamp;

    @Column(name = "user_login")
    private String user;

    @ElementCollection(fetch = FetchType.EAGER)
    @Column(name = "user_login")
    @CollectionTable(name = "user_likes_post",
            joinColumns = {@JoinColumn(name = "post_idpost")})
    private List<String> likes;
}
