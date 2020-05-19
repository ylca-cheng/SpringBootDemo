package com.cheng.demo.dao;

import com.cheng.demo.datasource.TargetDataSource;
import com.cheng.demo.domain.User;

import java.util.List;

/**
 * @Author: niecheng
 * @Date: 2020/5/19 15:43
 * @Version 1.0
 */
public interface UserDao {
    public List<User> findAllUsers();

    @TargetDataSource("ds2")
    User findUserById(int id);
}
