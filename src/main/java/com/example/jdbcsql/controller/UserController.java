package com.example.jdbcsql.controller;

import com.example.jdbcsql.entity.User;
import com.example.jdbcsql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/user")
    public List<User> findUser(@RequestParam String name){
        return userService.findUser(name);
    }
    @RequestMapping("/usersec")
    public List<User> findUserSec(@RequestParam String name){
        return userService.findUserSec(name);
    }
}
