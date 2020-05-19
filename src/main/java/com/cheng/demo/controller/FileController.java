package com.cheng.demo.controller;

import com.cheng.demo.domain.FileInfo;
import org.apache.commons.io.IOUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * Created by niecheng on 2018/12/4.
 *
 * 文件上传控制类
 */
@RestController
@RequestMapping("/file")
public class FileController {
    private String path = "d:\\background\\";

    @GetMapping
    public String index() {
        return "file";
    }

    /**
     *  注解@RequestParam 是从request里面拿取值
     * @param file
     * @return
     * @throws IOException
     */
    @PostMapping("/upload")
    public FileInfo upload(@RequestParam(value = "file") MultipartFile file) throws IOException {
        System.out.println(file.getName());
        System.out.println(file.getOriginalFilename());
        System.out.println(file.getSize());

        File localFile = new File(path,file.getOriginalFilename());
        file.transferTo(localFile);

        return new FileInfo(localFile.getAbsolutePath());
    }

    /**
     *  文件下载
     *  注解@PathVariable 是从URI模板里面来填充
     * @param id
     * @param request
     * @param response
     */
    @GetMapping("/download/{id}")
    public void download(@PathVariable("id") String id, HttpServletRequest request, HttpServletResponse response){
        try {
            InputStream in = new FileInputStream(new File(path,id+".jpg"));
            OutputStream out = response.getOutputStream();
            response.setContentType("application/x-download");
            response.addHeader("Content-Disposition", "attachment;filename=" + id + ".jpg");

            IOUtils.copy(in, out);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
