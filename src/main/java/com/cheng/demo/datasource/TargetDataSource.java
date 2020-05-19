package com.cheng.demo.datasource;

import java.lang.annotation.*;

/**
 * 在方法上使用，用于指定使用哪个数据源
 * Created by niecheng on 2019/2/19.
 */
@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TargetDataSource {
    String value();
}
