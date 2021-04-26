package java0181.lesson7;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class DeptDao {
    /**
     * 删除
     * @param id
     */
    public void deleteById(int id){
        Connection connection=DBconnection.getConnection();// 获取连接
        Statement statement=null;
        try {
            statement =connection.createStatement(); //通过连接获取 statement 对象
            String deleteStr="delete from book where id="+id;
            int i= statement.executeUpdate(deleteStr);  //通过 statement 执行sql 语句  返回操作的条数
            if (i>=0){
                System.out.println( "删除成功");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (statement!=null){
                try {
                    statement.close();  //关闭连接
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection!=null){
                try {
                    connection.close(); //关闭连接
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 删除
     * @param id
     */
    public void prepareDeleteById(int id){
        Connection connection=DBconnection.getConnection();// 获取连接
        PreparedStatement statement=null;
        try {
            String deleteStr="delete from book where id=?";
            statement =connection.prepareStatement(deleteStr); //通过连接获取 statement 对象
            statement.setInt(1,id);
            int i= statement.executeUpdate();  //通过 statement 执行sql 语句  返回操作的条数
            if (i>=0){
                System.out.println( "删除成功");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (statement!=null){
                try {
                    statement.close();  //关闭连接
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection!=null){
                try {
                    connection.close(); //关闭连接
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
