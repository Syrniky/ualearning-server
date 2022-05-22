package com.vntu.marenko.ualearning.server.controller;

import com.vntu.marenko.ualearning.server.dto.UserDto;
import com.vntu.marenko.ualearning.server.service.UserService;
import ma.glasnost.orika.MapperFacade;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    private final UserService userService;

    private final MapperFacade mapper;

    public UserController(UserService userService, MapperFacade mapper) {
        this.userService = userService;
        this.mapper = mapper;
    }

    @GetMapping("/{id}")
    public UserDto getUser(@PathVariable String id) {
        return mapper.map(userService.getUser(id), UserDto.class);
//        return userService.getUser(id);
    }
}
