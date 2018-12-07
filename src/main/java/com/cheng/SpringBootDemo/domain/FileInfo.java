package com.cheng.SpringBootDemo.domain;

/**
 * Created by niecheng on 2018/12/4.
 */
public class FileInfo {
    private String path;

    public FileInfo(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
