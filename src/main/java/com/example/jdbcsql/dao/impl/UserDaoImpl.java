package com.example.jdbcsql.dao.impl;

import com.example.jdbcsql.dao.UserDao;
import com.example.jdbcsql.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;
    @Override
    public List<User> findUser(String name) {
        List<User> myUserList= new ArrayList<>();
        String sql="select * from tbuser where username ='"+name+"'";
        Map<String, Object> param = new HashMap<>();
        List<Map<String, Object>> mapList=new ArrayList<>();
        mapList=jdbcTemplate.queryForList(sql,param);
        for(int i=0;i<mapList.size();i++){
            Map<String,Object> testmap= mapList.get(i);
            User myuser=new User();
            myuser.setName((String) testmap.get("username"));
            myUserList.add(myuser);
        }
        return myUserList;
    }

    @Override
    public List<User> findUserSec(String name) {
        List<User> myUserList= new ArrayList<>();
        String sql="select * from tbuser where username =:name";
        Map<String, Object> param = new HashMap<>();
        param.put("name",name);
        List<Map<String, Object>> mapList=new ArrayList<>();
        mapList=jdbcTemplate.queryForList(sql,param);
        for(int i=0;i<mapList.size();i++){
            Map<String,Object> testmap= mapList.get(i);
            User myuser=new User();
            myuser.setName((String) testmap.get("username"));
            myUserList.add(myuser);
        }
        return myUserList;
    }
}
