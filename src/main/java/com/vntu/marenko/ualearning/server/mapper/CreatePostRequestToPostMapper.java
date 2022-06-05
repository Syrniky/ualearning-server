package com.vntu.marenko.ualearning.server.mapper;

import com.vntu.marenko.ualearning.server.dto.CreatePostRequest;
import com.vntu.marenko.ualearning.server.model.Post;
import ma.glasnost.orika.CustomMapper;
import ma.glasnost.orika.MappingContext;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.time.Instant;

@Component
public class CreatePostRequestToPostMapper extends CustomMapper<CreatePostRequest, Post> {

    @Override
    public void mapAtoB(CreatePostRequest request, Post post, MappingContext context) {
        post.setText(request.getText());
        post.setUser(request.getUsername());
        post.setTimestamp(Date.from(Instant.now()));
    }
}
