package com.cheng.demo.datasource;

import com.cheng.demo.configuration.SpringUtil;
import com.cheng.demo.dao.UserDao;
import com.cheng.demo.domain.User;
import com.cheng.demo.service.inti.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Author: niecheng
 * @Date: 2020/5/19 14:47
 * @Version 1.0
 *
 * webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT 选用随机可用接口，防止websocket报错
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class DynamicDataSourceTests {
    private final Logger LOGGER = LoggerFactory.getLogger(DynamicDataSourceTests.class);

    @Autowired
    private UserDao userDao;

    @Test
    public void test(){
        LOGGER.info("当前数据源查询："+DynamicDataSourceContextHolder.getDataSourceKey());
        //默认数据源查询
        UserService userService = (UserService) SpringUtil.getBean("UserService");
        List<User> users = userService.findAllUsers();
        if(null != users){
            for (User user : users)
                System.out.println(user.getUserName()+","+user.getPassword());
        }
        // 切换数据源
        DynamicDataSourceContextHolder.setDataSourceKey("ds1");
        List<User> users1 = userService.findAllUsers();
        if(null != users1){
            for (User user : users1)
                System.out.println(user.getUserName()+","+user.getPassword());
        }
        // 切换数据源ds2
        User user2 = userDao.findUserById(1);
        if(null != user2){
            System.out.println(user2.getUserName()+","+user2.getPassword());
        }

        List<User> users2 = userService.findAllUsers();
        if(null != users2){
            for (User user : users)
                System.out.println(user.getUserName()+","+user.getPassword());
        }
    }
}
