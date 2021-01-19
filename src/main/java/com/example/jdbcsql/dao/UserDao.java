package com.example.jdbcsql.dao;

import com.example.jdbcsql.entity.User;

import java.util.List;

public interface UserDao {
    public List<User> findUser(String name);
    public List<User> findUserSec(String name);
}
