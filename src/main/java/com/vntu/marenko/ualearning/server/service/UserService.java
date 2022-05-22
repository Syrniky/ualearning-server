package com.vntu.marenko.ualearning.server.service;

import com.vntu.marenko.ualearning.server.model.User;

public interface UserService {

    String login(String login, String password);

    String register(User user);

    User getUser(String id);
}
