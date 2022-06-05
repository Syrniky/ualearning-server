package com.vntu.marenko.ualearning.server.controller;

import com.vntu.marenko.ualearning.server.dto.CreatePostRequest;
import com.vntu.marenko.ualearning.server.dto.PostDto;
import com.vntu.marenko.ualearning.server.model.Post;
import com.vntu.marenko.ualearning.server.service.PostService;
import ma.glasnost.orika.MapperFacade;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("post")
public class PostController {

    private final MapperFacade mapper;

    private final PostService postService;

    public PostController(MapperFacade mapper, PostService postService) {
        this.mapper = mapper;
        this.postService = postService;
    }

    @PostMapping
    public PostDto createPost(@RequestBody CreatePostRequest request) {
        Post toSave = mapper.map(request, Post.class);
        Post saved = postService.savePost(toSave);
        return mapper.map(saved, PostDto.class);
    }

    @GetMapping("/{id}")
    public PostDto getPost(@PathVariable int id) {
        return mapper.map(postService.getPost(id), PostDto.class);
    }

    @GetMapping("/user/{userId}")
    public List<PostDto> getPostsForUser(@PathVariable String userId) {
        List<Post> posts = postService.getPostsForUser(userId);
        posts.sort((p1, p2) -> p2.getTimestamp().compareTo(p1.getTimestamp()));
        return mapper.mapAsList(posts, PostDto.class);
    }
}
