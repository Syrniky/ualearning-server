package com.vntu.marenko.ualearning.server.service.impl;

import com.vntu.marenko.ualearning.server.model.Post;
import com.vntu.marenko.ualearning.server.repository.PostRepository;
import com.vntu.marenko.ualearning.server.service.PostService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public Post savePost(Post post) {
        return postRepository.save(post);
    }

    @Override
    public Post getPost(int id) {
        return postRepository.getReferenceById(id);
    }

    @Override
    public List<Post> getPostsForUser(String userId) {
        return postRepository.findByUser(userId);
    }
}
