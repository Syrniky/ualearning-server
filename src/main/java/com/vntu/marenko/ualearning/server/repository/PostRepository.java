package com.vntu.marenko.ualearning.server.repository;

import com.vntu.marenko.ualearning.server.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Integer> {

    List<Post> findByUser(String user);
}
