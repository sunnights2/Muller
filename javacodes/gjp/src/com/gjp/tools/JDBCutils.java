package com.gjp.tools;

import org.apache.commons.dbcp.BasicDataSource;

import javax.sql.DataSource;

public class JDBCutils {
    private static BasicDataSource datasource = new BasicDataSource();
    //静态代码块,实现必要参数设置
    static{
        datasource.setUrl("jdbc:mysql://127.0.0.1:3306/gjp?useUnicode=true&serverTimezone=GMT&characterEncoding=UTF-8&useSSL=false");
        datasource.setUsername("root");
        datasource.setPassword("123456");
        datasource.setMaxActive(10);
        datasource.setMaxIdle(5);
        datasource.setMinIdle(2);
        datasource.setInitialSize(10);
    }
    public static DataSource getDataSource(){
        return datasource;
    }
}
