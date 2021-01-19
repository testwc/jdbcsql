package com.example.jdbcsql.service;

import com.example.jdbcsql.entity.User;

import java.util.List;

public interface UserService {
    public List<User> findUser(String name);
    public List<User> findUserSec(String name);
}
