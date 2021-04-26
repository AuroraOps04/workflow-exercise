package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class mmain {
   public static book[] books = new book[]{
            new book("构建之法","邹欣",69,true),
            new book("java基础案例教程","黑马程序员",54,true),
            new book("Spark基础编程","林子雨",49.8,true),
            new book()

    };


    public static void main(String[] args) {


    //默认的书籍

        mmain m=new mmain();
        m.select(books);
        m.add(books);
        m.delete(books);
        m.alter(books);
        System.out.println("推荐的书籍为：");
        m.tj(books);
        System.out.println("更新后的书籍信息：");
       for (int i =0;i<books.length;i++){
            System.out.println(books[i].toString());}
    }
    // 补全方法，想好返回值，输入参数，方法名,挑自己的部分写
     //1.图书查看功能,

    //高效使人的7个习惯
    // 2.图书增加功能
    public void add(book[] books) {
        System.out.println("请输入要增加的书名：");
        Scanner sc=new Scanner(System.in);
        String name = sc.next();
        System.out.println("请输入作者：");
        String author = sc.next();
        System.out.println("请输入价格：");
        double price = sc.nextDouble();

        for (int i = 0; i < books.length; i++) {
            if (books[i].getBookname() == null) {
                books[i].setBookname(name);
                books[i].setAuth(author);
                books[i].setPrice(price);
                books[i].setIsStatue(true);
                System.out.println("添加成功");
                break;
            }

        }
    }



    // 3.图书删除功能
    public void delete(book[] books) {
        Scanner sc=new Scanner(System.in);
        int i;
        System.out.println("请输入要删除的书名:");
        String str = sc.next();
        if(str != null) {
            for(i = 0;i<books.length;i++) {
                if(books[i].getBookname().equals(str)) {
                    books[i] = null;
                    System.out.println("删除成功！");
                    break;
                }
            }
            if(i>=books.length){
                System.out.println("删除失败，没有此书籍");
            }

        }
    }
    // 4.图书修改功能
    public static void alter(book[] books) {
        int f = 0;
        System.out.println("请输入书名进行修改：");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        if(name != null) {
            for (int i = 0; i < books.length; i++) {
                if (books[i].getBookname().equals(name)) {
                    f = 1;
                    System.out.println("有此书籍！");
                    System.out.println("请输入修改后的作者名：");
                    String newauth = sc.next();
                    books[i].setAuth(newauth);
                    System.out.println("请输入修改后的价格：");
                    Double newprice = sc.nextDouble();
                    books[i].setPrice(newprice);
                    System.out.println(books[i].toString());
                    break;
                }
            }
        }
        if(f == 0){
            System.out.println("暂时没有此书！");
        }
    }
    // 5.图书推荐功能(可以直接随机)
    public  void tj(book[] Book){
        Random rand = new Random();
        int r1=rand.nextInt(Book.length);
        System.out.println(Book[r1]);
    }
}
