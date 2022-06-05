package com.vntu.marenko.ualearning.server.service.impl;

import com.vntu.marenko.ualearning.server.exception.UnauthorisedException;
import com.vntu.marenko.ualearning.server.exception.ValidationException;
import com.vntu.marenko.ualearning.server.model.User;
import com.vntu.marenko.ualearning.server.repository.UserRepository;
import com.vntu.marenko.ualearning.server.service.UserService;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public String login(String login, String password) {
        Optional<User> user = userRepository.findById(login);
        if (user.isPresent() &&
                user.get().getLogin().equals(login) &&
                user.get().getPassword().equals(password)) {
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
        return userRepository.getReferenceById(id);
    }

    @Override
    public List<User> top10() {
        Pageable pageable = PageRequest.of(0, 10, Sort.by(Sort.Direction.DESC, "rating"));
        return userRepository.findAll(pageable).getContent();
    }
}
