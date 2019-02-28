package com.cheng.SpringBootDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by niecheng on 2018/11/23.
 */
@Controller
@RequestMapping("freemarker")
public class FreemarkerController {
    @RequestMapping("hello")
    public String hello(Map<String,Object> map) {

        map.put("msg", "Hello Freemarker");
        return "freemarker";
    }
}
