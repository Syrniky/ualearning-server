package com.vntu.marenko.ualearning.server.controller;

import com.vntu.marenko.ualearning.server.dto.UserDto;
import com.vntu.marenko.ualearning.server.dto.UserRequest;
import com.vntu.marenko.ualearning.server.model.User;
import com.vntu.marenko.ualearning.server.service.UserService;
import ma.glasnost.orika.MapperFacade;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    }

    @GetMapping("/rating")
    public List<UserDto> rating() {
        return mapper.mapAsList(userService.top10(), UserDto.class);
    }

    @PutMapping("/{userId}")
    public UserDto updateUser(@PathVariable String userId, @RequestBody UserRequest request) {
        return mapper.map(userService.updateUser(userId,
                                                 mapper.map(request,
                                                            User.class)),
                          UserDto.class);
    }
}
