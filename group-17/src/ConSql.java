import java.sql.*;

public class ConSql {
    Connection con;
    public boolean conSql(String url, String user, String password) {
        try {
            //注册JDBC驱动程序
            Class.forName("com.mysql.cj.jdbc.Driver");
            //建立连接
            con = DriverManager.getConnection(url, user, password);
            if (!con.isClosed()) {
//                System.out.println("数据库连接成功");
                return true;
            }
            con.close();
        } catch (ClassNotFoundException e) {
//            System.out.println("数据库驱动没有安装");
            return false;
        } catch (SQLException e) {
            e.printStackTrace();
//            System.out.println("数据库连接失败");
            return false;
        }
        return false;
    }
    public void SearchSql(String bookname) {
        try{
            Statement statement = con.createStatement();

            String sql = "select * from books;";

            ResultSet resultSet = statement.executeQuery(sql);
            String name;
            int id;
            while (resultSet.next()) {
                id = resultSet.getInt("bookid");
                name = resultSet.getString("bookname");

                System.out.println("id: "+id+" 书名：" + name);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }



}
