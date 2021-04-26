package BookManager;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.DataTruncation;
import java.text.SimpleDateFormat;
import java.util.*;
    public void Bookdelete() {//根据图书名删除Book
        boolean flag = false;//定义布尔变量，用来判断是否存在指定的book名
        System.out.print("请输入要删除的图书名：");
        String a=input.next();
        for (Book book : list) {
            if(book.getName().equals(a) && book.getCon()=="可借") {
                list.remove(book);//删除当前满足要求的book
                System.out.println("删除《"+book.getName()+"》成功！");
                flag = true;
                break;
            }
            //如果Book当前状态为借出，则不能删除
            if(book.getName().equals(a) && book.getCon()=="借出"){
                flag = true;
                System.out.println("《"+book.getName()+"》当前为借出状态，不能删除！");
            }
        }
        if(flag == false){
            System.out.println("不存在指定图书名");
        }
    }
    public void Bookload() {//实现借出Book业务处理
        boolean flag = false;
        System.out.print("请输入你要借的书的书名：");
        String a=input.next();
        for (Book book : list) {
            if(book.getName().equals(a) && book.getCon()=="可借") {
                System.out.print("请输入借出日期（年-月-日）：");//可改为获取当前日期，暂时没改
                String t=input.next();
                book.setTime1(t);//改变book的借出日期
                book.setCon("借出");//改变book的状态
                book.setCount(book.getCount()+1);//借出次数+1
                System.out.println("借出《"+book.getName()+"》成功！");
                flag = true;
                break;
            }
            if(book.getName().equals(a) && book.getCon()=="借出"){////如果book当前状态为借出，则不能再借出
                System.out.println("《"+book.getName()+"》已借出！");
                flag = true;
            }
        }
        if(flag == false) {
            System.out.println("不存在指定图书名");
        }
    }