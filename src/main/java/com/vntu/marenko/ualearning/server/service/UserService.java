package com.vntu.marenko.ualearning.server.service;

import com.vntu.marenko.ualearning.server.model.User;

import java.util.List;

public interface UserService {

    String login(String login, String password);

    String register(User user);

    User getUser(String id);

    List<User> top10();
}
