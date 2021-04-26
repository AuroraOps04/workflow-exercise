package information_system;

import java.sql.*;
import java.util.HashMap;
import java.util.Scanner;

public class DataOperate {      //Model模型层 JDBC操作
	Connection conn=null;
	Scanner input = new Scanner(System.in);
	public DataOperate() { // 构造数据库操作对象，同时连接数据库并返回结果  
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/book", "root", "123456");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("连接数据库失败");
				e.printStackTrace();
			}
				
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("驱动加载失败");
			e.printStackTrace();
		}
	}
	public boolean login(String username,String password){     //管理员登录操作
		boolean flag = false;
		try {
            PreparedStatement preparedStatement=conn.prepareStatement("select pwd from user where username=? ");
            preparedStatement.setString(1,username);
            ResultSet resultSet=null;
            resultSet=preparedStatement.executeQuery();
            while(resultSet.next())
            {
                String pwd=resultSet.getString("pwd");
                if(pwd.equals(password))
                {
                    flag=true;
                }
            }
        } catch (SQLException throwables) {
            System.out.println("登录失败！");
        }
        return flag;
    }
	
	public void selectall(){      //查看全部图书信息操作

		      
    }
	public void insert(Book book){       //添加图书信息操作
	
    }
	public void update(String id,String name){     //更新学生信息操作

    }
	public void delete(String id){       //删除学生信息操作
		
    }
	public void recommend(){       //根据学号查看学生信息操作
		
        
    }

	public static boolean isNumber(String str){       //判断输入是否为数字
	    for (int i = str.length();--i>=0;){ 
	        if (!Character.isDigit(str.charAt(i))){
	           return false;
	        }
		}
	   return true;
	}
}
