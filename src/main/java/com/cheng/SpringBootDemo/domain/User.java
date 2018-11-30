package com.cheng.SpringBootDemo.domain;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.support.spring.annotation.FastJsonFilter;

import java.text.Format;
import java.util.Date;

/**
 * Created by niecheng on 2018/11/20.
 */
public class User {

    private String userName; // 用户名
    private String Password; // 密码
    @JSONField(format = "yyyy-MM-dd")
    private Date birth;

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

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
}
