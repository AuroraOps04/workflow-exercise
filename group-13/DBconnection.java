package java0181.lesson7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBconnection {
    private  static  String  url="jdbc:mysql://localhost:3306/mydata?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC";
    private static String userName="root";
    private static String passWord="123456";
    private  static String driverName="com.mysql.jdbc.Driver";
    static {
        try {
            Class.forName(driverName);
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
