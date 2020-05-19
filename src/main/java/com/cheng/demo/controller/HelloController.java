package com.cheng.demo.controller;

import com.cheng.demo.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by niecheng on 2018/11/20.
 *
 * @RestController的意思就是controller里面的方法都以json格式输出，不用再写什么jackjson配置的了！
 */
@RestController
public class HelloController {

    /**
     * localhost:8080/hello
     * @return
     */
    @RequestMapping("/hello")
    public String index(){
        System.out.println("hello !");
        return "hello!";
    }

    /**
     * 登录跳转
     * @param password
     * @param username
     * @return
     */
    @RequestMapping("/user")
    public User getUser(@RequestParam(value = "form-password") String password,@RequestParam(value = "form-username") String username){
        User user = new User();
        user.setUserName(username);
        user.setPassword(password);
        return user;
    }
}
