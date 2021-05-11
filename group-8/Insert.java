import DBconnection;

import java.sql.Connection;
import java.sql.SQLException;

public class Insert {
    public void insert(String name, String book) {
        Connection connection = DBconnection.getConnection();
        Statement statement = null;
        try {
            statement = connection.createStatement();
            String insertStr = "insert into readbook(name,book) values('" + name + "','" + book + "')";
            int i = statement.executeUpdate(insertStr);
            if (i > 0) {
                java.lang.System.out.println("插入成功");
            } else {
                java.lang.System.out.println("插入失败");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (statement != null) {
                try {
                    statement.close();  //关闭连接
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close(); //关闭连接
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
