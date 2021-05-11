import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class query{
    public List<BS> query(String name, String book) {
        List<BS> depts = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        Statement statement = null;
        ResultSet set = null;
        try {
            statement = connection.createStatement();
            String selectStr = " ";
            if (name != null && !name.equals("")) {
                selectStr = "select * from readbook where name like '%" + name + "%'";
            } else if (book != null && !book.equals("")) {
                selectStr = "select * from readbook where book like '%" + book + "'";
            } else {
                selectStr = "select * from readbook";
            }

            set = statement.executeQuery(selectStr);

            while (set.next()) {   //遍历 resultSet
                BS bs = new BS();
                bs.setId(set.getInt("id"));
                bs.setName(set.getString("name"));
                bs.setBook(set.getString("book"));
                depts.add(bs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("更新失败");
        } finally {
            if (set != null) {
                try {
                    set.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
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

        return depts;

    }
}