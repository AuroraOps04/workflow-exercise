package LibSys;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conn {
    private static String url = "jdbc:mysql://localhost:3306/book?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false";
    private static String userName = "root";
    private static String passWord = "123456";
    private static String driverName = "com.mysql.cj.jdbc.Driver";
    static {
        try {
            Class.forName(driverName);  //加载数据库驱动
            System.out.println("加载数据库驱动");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, userName, passWord);  //获取数据库连接
            System.out.println("数据库连接成功");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("数据库连接失败");
        }
        return connection;
    }
}

