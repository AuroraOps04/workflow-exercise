package com.wmw6;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
    public void update(int id, String name, String book) {
        Connection connection = DBconnection.getConnection();
        Statement statement = null;
        try {
            statement = connection.createStatement();
            String deleteStr = "update readbook set name='" + name + "', book='" + book + "' where id=" + id;
            int i = statement.executeUpdate(deleteStr);
            if (i > 0) {
                System.out.println("修改成功");
            } else {
                System.out.println("修改失败");
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
