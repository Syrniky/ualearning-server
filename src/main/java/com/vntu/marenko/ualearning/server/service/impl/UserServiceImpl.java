package com.vntu.marenko.ualearning.server.service.impl;

import com.vntu.marenko.ualearning.server.exception.UnauthorisedException;
import com.vntu.marenko.ualearning.server.exception.ValidationException;
import com.vntu.marenko.ualearning.server.model.User;
import com.vntu.marenko.ualearning.server.repository.UserRepository;
import com.vntu.marenko.ualearning.server.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public String login(String login, String password) {
        User user = userRepository.getById(login);
        if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
            return login.concat("_").concat(password);
        }
        throw new UnauthorisedException();
    }

    @Override
    public String register(User user) {
        if (userRepository.existsById(user.getLogin())) {
            throw new ValidationException();
        }
        userRepository.save(user);
        return login(user.getLogin(), user.getPassword());
    }

    @Override
    public User getUser(String id) {
        return userRepository.getById(id);
    }
}
