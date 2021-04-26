package com.library.dao;

import com.library.domain.Book;


public class Database {


    //增加记录
    public static void insertBook(Book s)
    {
        try
        {
            Connection conn=getConnection();
            int no=s.getNo();
            String name=s.getName();
            String sql="insert into library values(?,?)";
            PreparedStatement pstmt=conn.prepareStatement(sql);
            pstmt.setInt(1, no);
            pstmt.setString(2, name);
            int n=pstmt.executeUpdate();
            if(n>0)
            {
                System.out.println("\n插入数据成功");
            }
        }catch(SQLException e)
        {
            e.printStackTrace();
        }

    }

    //查找信息
    public static Book getPersonInformation(String bname)
    {
        Connection conn=getConnection();
        Book s=null;
        String sql = "select * from library where bname= ?";
        try
        {
            PreparedStatement pstmt=conn.prepareStatement(sql);
            pstmt.setString(1, bname);
            ResultSet rs=pstmt.executeQuery();
            while(rs.next())
            {
                int no=rs.getInt(1);
                String name=rs.getString(1);
                s= new Book(no,name);
            }
        }catch(SQLException e)
        {
            e.printStackTrace();
        }


        return  s;
    }

    public static Book recommendation(int book_id)
    {
        Connection conn=getConnection();
        Book s=null;
        String sql = "select * from library where book_id= ?";
        try
        {
            PreparedStatement pstmt=conn.prepareStatement(sql);
            pstmt.setInt(1, book_id);
            ResultSet rs=pstmt.executeQuery();
            while(rs.next())
            {
                int no=rs.getInt(1);
                String name=rs.getString(2);
                s= new Book(no,name);
            }
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
        
        return  s;
    }

    //删除记录
    public static void deleteBook(String bname)
    {
        Connection conn=getConnection();
        String sql="delete from library where bname=?";
        try
        {
            PreparedStatement pstmt=conn.prepareStatement(sql);
            pstmt.setString(1, bname);
            pstmt.executeUpdate();
        }catch(SQLException e)
        {
            e.printStackTrace();
        }


    }




    //连接数据库
    public static Connection getConnection()
    {
        Connection conn=null;

        try
        {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());

            conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/library?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT", "root", "root171025");


        }catch(SQLException e)
        {
            e.printStackTrace();
        }

        return conn;
    }





}


