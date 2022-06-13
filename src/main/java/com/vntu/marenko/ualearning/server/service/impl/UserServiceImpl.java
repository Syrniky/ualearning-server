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
        if (user.getAge() > 12) {
            userRepository.save(user);
            return login(user.getLogin(), user.getPassword());
        } else {
            throw new ValidationException();
        }
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

    @Override
    public User updateUser(String login, User userToSave) {
        User fromDb = userRepository.getReferenceById(login);
        if (userToSave.getLogin() != null) {
            fromDb.setLogin(userToSave.getLogin());
        }
        if (userToSave.getPassword() != null) {
            fromDb.setPassword(userToSave.getPassword());
        }
        if (userToSave.getName() != null) {
            fromDb.setName(userToSave.getName());
        }
        if (userToSave.getSurname() != null) {
            fromDb.setSurname(userToSave.getSurname());
        }
        if (userToSave.getAge() != 0) {
            if (userToSave.getAge() > 12) {
                fromDb.setAge(userToSave.getAge());
            } else {
                throw new ValidationException();
            }
        }
        if (userToSave.getInstitution() != null) {
            fromDb.setInstitution(userToSave.getInstitution());
        }
        if (userToSave.getEmail() != null) {
            fromDb.setEmail(userToSave.getEmail());
        }
        return userRepository.save(fromDb);
    }
}
