package com.cheng.demo.service.impl;

import com.cheng.demo.dao.UserDao;
import com.cheng.demo.domain.User;
import com.cheng.demo.service.inti.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: niecheng
 * @Date: 2020/5/19 15:49
 * @Version 1.0
 */
@Service("UserService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAllUsers() {
        return userDao.findAllUsers();
    }
}
