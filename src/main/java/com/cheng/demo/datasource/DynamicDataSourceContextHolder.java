package com.cheng.demo.datasource;

import java.util.ArrayList;
import java.util.List;

/**
 * @author  niecheng
 * @date 2019/2/
 * 动态数据源上下文.
 */
public class DynamicDataSourceContextHolder {
    /**
     * 当使用ThreadLocal维护变量时，ThreadLocal为每个使用该变量的线程提供独立的变量副本，
     * 所以每一个线程都可以独立地改变自己的副本，而不会影响其它线程所对应的副本。
     */
    private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();
    /**
     * 管理所有的数据源id;
     * 主要是为了判断数据源是否存在;
     */
    static List<String> dataSourceIds = new ArrayList<String>();

    /**
     * 使用setDataSourceKey设置当前的
     * @param dataSourceKey 数据类型
     */
    static void setDataSourceKey(String dataSourceKey) {
        contextHolder.set(dataSourceKey);
    }

    static String getDataSourceKey() {
        return contextHolder.get();
    }

    static void clearDataSourceKey() {
        contextHolder.remove();
    }

    /**
     * 判断指定DataSrouce当前是否存在
     *
     * @param dataSourceId 数据源id
     * @return true or false
     * @author niecheng
     * @date  2019年2月19日
     */
    static boolean containsDataSource(String dataSourceId){
        return dataSourceIds.contains(dataSourceId);
    }

}
