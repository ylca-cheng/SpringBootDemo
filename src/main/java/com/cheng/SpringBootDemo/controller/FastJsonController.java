package com.cheng.SpringBootDemo.controller;

import com.cheng.SpringBootDemo.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * Created by niecheng on 2018/11/29.
 *
 * 整合fastjson测试
 */
@Controller
@RequestMapping("fastjson")
public class FastJsonController {

    @RequestMapping("/test")
    @ResponseBody
    public User test() {
        User user = new User();

        user.setUserName("jack");
        user.setPassword("jack123");
        user.setBirth(new Date());

        int i = 1/0;
        return user;
    }
}
