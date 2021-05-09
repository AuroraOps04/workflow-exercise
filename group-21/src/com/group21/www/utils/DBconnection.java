package com.group21.www.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBconnection {

    //设置连接的数据库名
    private static String url = "jdbc:mysql://localhost:3306/book?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC";

    //数据库用户名
    private static String userName = "root";

    //数据库用户密码
    private static String passWord = "root";

    private static String driverName = "com.mysql.jdbc.Driver";

    static {

        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取数据库连接对象
     *
     * @return 数据库连接对象
     * @author 林朝玮
     */
    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, userName, passWord);

        } catch (SQLException e) {
            e.printStackTrace();

        }
        return connection;
    }


}
