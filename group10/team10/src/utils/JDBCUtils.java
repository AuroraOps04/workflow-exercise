package utils;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @Auther: jackyar
 * @Date: 2021/4/24 14:58
 * @Description: 数据库工具类
 */
public class JDBCUtils {
    /**
     * 获取数据库连接
     * @return conn 数据库连接
     * @throws Exception
     */
    public static Connection getConnection() throws Exception {
        InputStream inStream = ClassLoader.getSystemClassLoader().getResourceAsStream("jdbc.properties");
        Properties properties = new Properties();
        properties.load(inStream);

        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String classLoader = properties.getProperty("driverClass");
        String url = properties.getProperty("url");

        Class.forName(classLoader);
        return DriverManager.getConnection(url, user, password);
    }

    /**
     * 关闭数据库资源
     * @param conn
     * @param ps
     */
    public static void closeResources(Connection conn, PreparedStatement ps){
        try {
            if (ps != null) ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 重载方法，关闭连接资源
     * @param conn
     * @param ps
     * @param rs
     */
    public static void closeResources(Connection conn, PreparedStatement ps, ResultSet rs){
        try {
            if (ps != null) ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (rs != null) rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
