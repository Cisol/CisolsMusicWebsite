package com.cisol.cisolsmusicwebsite.utils;

import org.apache.commons.dbcp.BasicDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Cisol on 2017/5/13 0013.
 */
public class DriverManager {
    private static final String url = "jdbc:mysql://localhost:3306/music";
    private static final String username = "root";
    private static final String password = "123456";
    private static final String driverName = "com.mysql.jdbc.Driver";

    private Connection conn = null;
    private PreparedStatement pst = null;

    private DriverManager() {}

    public DriverManager getInstance() {
        return DriverManagerProducer.driverManager;
    }

    private static BasicDataSource bds = null;

    public Connection getConnection() {
        if(bds == null) {
            synchronized (bds) {
                if (bds == null) {
                    //创建数据源对象
                    bds = new BasicDataSource();
                    //设置连接池所需的驱动
                    bds.setDriverClassName(driverName);
                    bds.setUrl(url);
                    bds.setUsername(username);
                    bds.setPassword(password);
                    //设置连接池的初始连接数
                    bds.setInitialSize(10);
                    //设置连接池最多可以有多少个活动连接数
                    bds.setMaxActive(20);
                    //设置连接池最少有多少个空闲连接
                    bds.setMinIdle(2);
                }
            }
        }
        try {
            return bds.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    static class DriverManagerProducer{
        //內部类保证使用时才初始化，同时保证线程安全
        private static DriverManager driverManager = new DriverManager();
    }
}
