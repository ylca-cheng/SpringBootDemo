package com.cheng.SpringBootDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by niecheng on 2018/11/26.
 *
 * Thymeleaf模板测试
 */
@Controller
@RequestMapping("thymeleaf")
public class ThymeleafController {

    @RequestMapping("hello")
    public String hello(Map<String, Object> map) {
        map.put("msg", "Hello Thymeleaf");
        return "hello";
    }
}
