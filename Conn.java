package DB;

import Bag.Book;
import java.sql.ResultSet;
import java.sql.*;


import static sun.misc.Version.print;

public class Conn {
    private Connection conn = null;
    String[] arr = new String[10000];
    int i;

    public void connect() {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://115.159.41.241/db211806159?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone = GMT";
        String user = "user211806159";
        String pwd = "211806159";
        try {
            Class.forName(driver);
            this.setConn(DriverManager.getConnection(url, user, pwd));
            System.out.println("数据库连接成功");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    public int add(Book book) throws SQLException {
        try {
            this.connect();
            String sql = "insert into book(id,name) values(?,?)";
            PreparedStatement pstmt;
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, String.valueOf(book.getId()));
            pstmt.setString(2, String.valueOf(book.getName()));
            int result = pstmt.executeUpdate();
            System.out.println("插入成功！");
            pstmt.close();
            this.conn.close();
            return result;
        } catch (SQLException e) {
            System.out.println("插入失败!");
            e.printStackTrace();
            try {
                this.conn.close();
            } catch (SQLException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            return 0;
        }
    }
    public int delete(Book book) throws SQLException {
        try {
            this.connect();
            String sql = "delete from book where id = ? and name = ?";
            PreparedStatement pstmt;
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, String.valueOf(book.getId()));
            pstmt.setString(2, String.valueOf(book.getName()));
            int result = pstmt.executeUpdate();
            System.out.println("删除成功！");
            pstmt.close();
            this.conn.close();
            return result;
        } catch (SQLException e) {
            System.out.println("删除失败!");
            e.printStackTrace();
            try {
                this.conn.close();
            } catch (SQLException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            return 0;
        }
    }

    public void sel(Book book) {
        try {
            this.connect();
            String sql = "select * from book";
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql);
            while (result.next()) {
                String id = result.getString("id");
                String name = result.getString("name");
                System.out.print("书号：" + id + " ");
                System.out.println("书名：" + name);
            }
            conn.close();
            result.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public int modify(Book book) throws SQLException {
        try {
            this.connect();
            String sql = "update book set name = ? where id = ?";
            PreparedStatement pstmt;
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, String.valueOf(book.getId()));
            pstmt.setString(2, String.valueOf(book.getName()));
            int result = pstmt.executeUpdate();
            System.out.println("删除成功！");
            pstmt.close();
            this.conn.close();
            return result;
        } catch (SQLException e) {
            System.out.println("删除失败!");
            e.printStackTrace();
            try {
                this.conn.close();
            } catch (SQLException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            return 0;
        }
    }
    public void rec(Book book)  {
        String[] arr = new String[10];
        try {
            this.connect();
            String sql = "select name from book";
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql);
            while (result.next()) {
                //String id = result.getString("id");
                //String name = result.getString("name");
                //System.out.print("书号：" + id + " ");
                for(i=0; result.next(); i++) {
                    arr[i] = result.getString("name");
                }
                System.out.println("好书推荐：" + arr[i]);
            }
            conn.close();
            result.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


}