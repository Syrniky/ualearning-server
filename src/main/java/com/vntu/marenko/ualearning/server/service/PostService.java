package com.vntu.marenko.ualearning.server.service;

import com.vntu.marenko.ualearning.server.model.Post;

import java.util.List;

public interface PostService {

    Post savePost(Post post);

    Post getPost(int id);

    List<Post> getPostsForUser(String userId);
}
