package information_system;

import java.sql.*;
import java.util.HashMap;
import java.util.Scanner;

public class DataOperate {      //Modelģ�Ͳ� JDBC����
	Connection conn=null;
	Scanner input = new Scanner(System.in);
	public DataOperate() { // �������ݿ��������ͬʱ�������ݿⲢ���ؽ��  
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/book", "root", "123456");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("�������ݿ�ʧ��");
				e.printStackTrace();
			}
				
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("��������ʧ��");
			e.printStackTrace();
		}
	}
	public boolean login(String username,String password){     //����Ա��¼����
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
            System.out.println("��¼ʧ�ܣ�");
        }
        return flag;
    }
	
	public void selectall(){      //�鿴ȫ��ͼ����Ϣ����

		      
    }
	public void insert(Book book){       //���ͼ����Ϣ����
	
    }
	public void update(String id,String name){     //����ѧ����Ϣ����

    }
	public void delete(String id){       //ɾ��ѧ����Ϣ����
		
    }
	public void recommend(){       //����ѧ�Ų鿴ѧ����Ϣ����
		
        
    }

	public static boolean isNumber(String str){       //�ж������Ƿ�Ϊ����
	    for (int i = str.length();--i>=0;){ 
	        if (!Character.isDigit(str.charAt(i))){
	           return false;
	        }
		}
	   return true;
	}
}
