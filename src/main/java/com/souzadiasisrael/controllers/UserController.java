package com.souzadiasisrael.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.souzadiasisrael.domain.entities.User;

@RestController
public class UserController {
    @GetMapping("/users")
    public List<User> get() {
        User user1 = new User(1L, "John Smith");
        User user2 = new User(2L, "Mary Carpenter");

        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        return users;
    }
}
