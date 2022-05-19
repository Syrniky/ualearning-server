package com.vntu.marenko.ualearning.server.controller;

import com.vntu.marenko.ualearning.server.model.Result;
import com.vntu.marenko.ualearning.server.model.Test;
import com.vntu.marenko.ualearning.server.model.User;
import com.vntu.marenko.ualearning.server.repository.ResultRepository;
import com.vntu.marenko.ualearning.server.repository.TestRepository;
import com.vntu.marenko.ualearning.server.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Control {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TestRepository testRepository;

    @Autowired
    private ResultRepository resultRepository;

    @GetMapping("users/login")
    public User getUser() {
        User user = userRepository.getById("login");
        System.out.println(user);
        return user;
    }

    @GetMapping("test/test")
    public Test getTest() {
        return testRepository.getById(1);
    }

    @GetMapping("login/result")
    public Result getResult() {
        return resultRepository.getById(1);
    }
}
