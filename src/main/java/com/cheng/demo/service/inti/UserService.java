package com.cheng.demo.service.inti;

import com.cheng.demo.domain.User;

import java.util.List;

/**
 * @Author: niecheng
 * @Date: 2020/5/19 15:49
 * @Version 1.0
 */
public interface UserService {
    List<User> findAllUsers();
}
