package com.cisol.cisolsmusicwebsite.utils;

import com.mysql.jdbc.PreparedStatement;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by Cisol on 2017/5/13 0013.
 */
public class DriverManager {
    private static final String url = "jdbc:mysql://localhost:3306/CisolsMusic";
    private static final String username = "root";
    private static final String password = "123456";
    private static final String driverName = "com.mysql.jdbc.Driver";

    private Connection conn = null;
    private PreparedStatement pst = null;

    private DriverManager() {}

    public static DriverManager getInstance() {
        return DriverManagerProducer.driverManager;
    }

    public Connection getConnection() {
        try {
            //动态加载mysql驱动
            Class.forName(driverName);
            conn = java.sql.DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    static class DriverManagerProducer{
        //內部类保证使用时才初始化，同时保证线程安全
        private static DriverManager driverManager = new DriverManager();
    }
}
