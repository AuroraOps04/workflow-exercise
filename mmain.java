package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mmain {
    public static void main(String[] args) {
        book[] books = new book[]{
                new book("构建之法","邹欣",69,true),
                new book("java基础案例教程","黑马程序员",54,true),
                new book("Spark基础编程","林子雨",49.8,true),

        };//默认的书籍
        for (int i =0;i<books.length;i++){
        System.out.println(books[i].toString());}
        mmain m=new mmain();
        m.select(books);
    }
    // 补全方法，想好返回值，输入参数，方法名,挑自己的部分写
     //1.图书查看功能,

    //高效使人的7个习惯
    // 2.图书增加功能
    // 3.图书删除功能
    // 4.图书修改功能
    // 5.图书推荐功能(可以直接随机)
}
