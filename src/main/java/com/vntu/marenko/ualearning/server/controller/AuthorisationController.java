package com.vntu.marenko.ualearning.server.controller;

import com.vntu.marenko.ualearning.server.dto.LoginRequest;
import com.vntu.marenko.ualearning.server.dto.UserRequest;
import com.vntu.marenko.ualearning.server.model.User;
import com.vntu.marenko.ualearning.server.service.UserService;
import ma.glasnost.orika.MapperFacade;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorisationController {

    private final UserService userService;

    private final MapperFacade mapper;

    public AuthorisationController(UserService userService, MapperFacade mapper) {
        this.userService = userService;
        this.mapper = mapper;
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {
        return userService.login(request.getLogin(), request.getPassword());
    }

    @PostMapping("/register")
    public String register(@RequestBody UserRequest request) {
        return userService.register(mapper.map(request, User.class));
    }
}
