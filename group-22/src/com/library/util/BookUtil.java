package com.library.util;

import com.library.dao.Database;
import com.library.domain.Book;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Random;

public class BookUtil {


    private static BufferedReader getBF()
    {
        InputStream in =System.in;
        InputStreamReader input = new InputStreamReader(in);
        BufferedReader bf  = new BufferedReader(input);
        return bf;

    }

    public static void insert()
    {
        BufferedReader br=getBF();
        Book st = new Book();

        String s=null;
        try
        {
            System.out.println("输入序号");
            s=br.readLine();
            int no = Integer.parseInt(s);
            //System.out.println(no);
            st.setNo(no);
            System.out.println("输入书名");
            String name=br.readLine();
            //System.out.println(name);
            st.setName(name);
            //br.close();
        }catch(Exception e)
        {
            e.printStackTrace();
        }

        Database.insertBook(st);

    }

    //查询图书
    public static void select()
    {
        BufferedReader br =getBF();
        System.out.println("请输入你想查询的书籍名");
        try
        {
            String s= br.readLine();
            String bname=s;
            Book st=Database.getPersonInformation(bname);
            System.out.println("你查询图书的存在" + " \n序号是："+st.getNo());
            //br.close();
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    //图书推荐
    public static void tui()
    {

        Random r = new Random();
        int number = r.nextInt(10);
        int Book_id= number;
        Book st=Database.recommendation(Book_id);
        System.out.println("推荐阅读："+ "序号： " + st.getNo()+" \n姓名是："+st.getName());
        //br.close();
    }

    //更改数据
    public static void updateInformation()
    {
        BufferedReader br=getBF();
        System.out.println("请输入你想修改的书籍名");
        try
        {
            String s=br.readLine();
            String bname= s;
            Book st=Database.getPersonInformation(bname);
            Database.deleteBook(bname);
            System.out.println("你想修改 [1]序号    [2]书名   ");
            int x=Integer.parseInt(br.readLine());
            switch(x)
            {

                case 1:
                    System.out.println("输入新的序号：");
                    int no =Integer.parseInt(br.readLine());
                    st.setNo(no);
                    Database.insertBook(st);
                    break;
                case 2:
                    System.out.println("输入新的书名：");
                    String name=br.readLine();
                    st.setName(name);
                    Database.insertBook(st);
                    break;
                default:
                    System.exit(0);



            }
        }catch(IOException e)
        {
            e.printStackTrace();
        }

    }

    //删除书籍
    public static void deleteBook()
    {
        BufferedReader br=getBF();
        System.out.println("输入你想删除的书籍名");
        try
        {
            String bname=br.readLine();
            Database.deleteBook(bname);
        }catch(IOException e)
        {
            e.printStackTrace();
        }
        System.out.println("删除成功。");
    }


}
