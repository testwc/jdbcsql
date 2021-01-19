package com.example.jdbcsql.service.impl;

import com.example.jdbcsql.dao.UserDao;
import com.example.jdbcsql.entity.User;
import com.example.jdbcsql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> findUser(String name) {
        return userDao.findUser(name);
    }

    @Override
    public List<User> findUserSec(String name) {
        return userDao.findUserSec(name);
    }
}
