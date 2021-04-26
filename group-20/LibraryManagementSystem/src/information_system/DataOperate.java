package information_system;

import java.awt.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
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
		String sql="select * from info";
		try {
			Statement statement = conn.createStatement();
			ResultSet resultSet=null;
	        resultSet=statement.executeQuery(sql);
        	System.out.println("图书ID"+"\t"+"姓名"+"\t");
	        while (resultSet.next())
            {	
	        	System.out.print(resultSet.getString("id")+"\t");
	        	System.out.print(resultSet.getString("name")+"\t");
	        	System.out.println();
            }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		      
    }
	public void insert(Book book){       //添加图书信息操作
		String id=book.getId();
		String name=book.getName();
        try{
            PreparedStatement preparedStatement=conn.prepareStatement("insert into info value(?,?)");
           preparedStatement.setString(1,id);
           preparedStatement.setString(2,name);
            int num=preparedStatement.executeUpdate();
            if(num!=0){
                System.out.println("添加成功！");
            }
            else{
                System.out.println("添加失败！");
            }
        }
        catch (Exception e)
        {
            System.out.println("添加失败！");
        }
    }
	public void update(String id,String name){     //更新学生信息操作

        try {
            String sql=null;
            sql="update info set name=? where id=?";    
            PreparedStatement preparedStatement=conn.prepareStatement(sql);
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,id);

            int num=preparedStatement.executeUpdate();
            if(num==1){
                System.out.println("更新成功！");
            }
            else{
                System.out.println("更新不成功");
            }
        } catch (SQLException throwables) {
            System.out.println("更新异常");
        }
    }
	public void delete(String id){       //删除图书信息操作
		
    }
	public void recommend(){       //图书推荐功能
		String sql="select * from info";
		try {
			ArrayList<String> list = new ArrayList<String>();
			Statement statement = conn.createStatement();
			ResultSet resultSet=null;
	        resultSet=statement.executeQuery(sql);
	        while (resultSet.next())
            {	
	        	list.add(resultSet.getString("name"));	        	
            }
	        Random random = new Random();
	        int n = random.nextInt(list.size());
	        System.out.println(list.get(n));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
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
