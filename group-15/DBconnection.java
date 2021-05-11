package java211808659.lesson06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
    private static Connection Conn; // 数据库连接对象

    // 数据库连接地址
    private static String URL = "jdbc:mysql://localhost:3306/15groupbook?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC";
    // 数据库的用户名
    private static String UserName = "root";
    // 数据库的密码
    private static String Password = "";

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // 加载驱动
//            System.out.println("加载驱动成功!!!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            //通过DriverManager类的getConenction方法指定三个参数,连接数据库
            Conn = DriverManager.getConnection(URL, UserName, Password);
//            System.out.println("连接数据库成功!!!");
            //返回连接对象
            return Conn;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
