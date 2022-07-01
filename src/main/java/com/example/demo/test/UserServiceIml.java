package com.example.demo.test;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceIml implements UserService {

  @Resource
    private UserDao userDao;
    @Override
    public void getDept(String id) {
        userDao.selectDao(id);


    }
}
