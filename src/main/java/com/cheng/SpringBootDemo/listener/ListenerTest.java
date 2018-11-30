package com.cheng.SpringBootDemo.listener;

import org.springframework.stereotype.Component;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by niecheng on 2018/11/29.
 *
 * 自定义监听器
 * 和过滤器一样有两种注册方法
 */
//@Component
public class ListenerTest implements ServletContextListener{
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("监听器初始化...");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("监听器销毁...");
    }
}
