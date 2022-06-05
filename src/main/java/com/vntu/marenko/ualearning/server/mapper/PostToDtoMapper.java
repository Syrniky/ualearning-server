package com.vntu.marenko.ualearning.server.mapper;

import com.vntu.marenko.ualearning.server.dto.PostDto;
import com.vntu.marenko.ualearning.server.model.Post;
import ma.glasnost.orika.CustomMapper;
import ma.glasnost.orika.MappingContext;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class PostToDtoMapper extends CustomMapper<Post, PostDto> {

    @Override
    public void mapAtoB(Post post, PostDto postDto, MappingContext context) {
        postDto.setId(post.getId());
        postDto.setText(post.getText());
        postDto.setTimestamp(post.getTimestamp().toString());
        postDto.setLogin(post.getUser());
        postDto.setLikes(new ArrayList<>(post.getLikes()));
    }
}
