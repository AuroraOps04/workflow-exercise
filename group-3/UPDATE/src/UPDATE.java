import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UPDATE {
    /**
     * 更改
     * @param id
     */
    public void updateById(int id,String name){
        Connection connection=DBconnection.getConnection();// 获取连接
        Statement statement=null;
        try {
            statement =connection.createStatement(); //通过连接获取 statement 对象
            String deleteStr="update book set name='"+name+"' where id="+id;
            int i= statement.executeUpdate(deleteStr);  //通过 statement 执行sql 语句  返回操作的条数
            if (i>=0){
                System.out.println( "更新成功");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("更新失败");
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
