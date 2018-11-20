package com.cheng.SpringBootDemo.domain;

/**
 * Created by niecheng on 2018/11/20.
 */
public class User {

    private String userName; // 用户名
    private String Password; // 密码

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
