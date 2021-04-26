package LibSys;

import java.sql.*;
import java.util.ArrayList;
import java.util.Random;

public class Func implements Funct {
    Conn conn = new Conn();
    Connection connection = conn.getConnection();
    public void add(String id, String name) {
    }

    @Override
    public void select() {
        String sql = "select * from book";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = null;
            resultSet = statement.executeQuery(sql);
            System.out.printf("图书id"+"              "+"书名");
            System.out.println();
            while (resultSet.next())
            {
                System.out.printf("%-20s",resultSet.getString("id"));
                System.out.printf("%-20s",resultSet.getString("name"));
                System.out.println();
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public void recommend() {
    }
}
