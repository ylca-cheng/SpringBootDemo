package com.cheng.SpringBootDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by niecheng on 2018/11/21.
 */
@RestController
@RequestMapping("/error")
public class ErrorController {

    /**
     * 404页面
     */
    @PostMapping(value = "/404")
    public String error_404() {
        return "error";
    }

    /**
     * 500页面
     */
    @PostMapping(value = "/500")
    public String error_500() {
        return "error";
    }

}
