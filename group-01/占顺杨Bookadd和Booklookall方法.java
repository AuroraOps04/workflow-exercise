package BookManager;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.DataTruncation;
import java.text.SimpleDateFormat;
import java.util.*;

public class Methods {
    Scanner input = new Scanner(System.in);
    private int i=1;
    List<Book> list = new ArrayList<>();
    Book book1=new Book(i++,"构建之法","可借",1,null, null);
    Book book2=new Book(i++,"NoSQL","可借",0,null, null);
    Book book3=new Book(i++,"Python","可借",0,null, null);
    public void Bookadd(){
        list.add(book1);
        list.add(book2);
        list.add(book3);
    }
    public void Booklookall(){//实现查看Book信息
        System.out.println("编号\t状态\t名称\t\t借出日期");
        for (Book book : list) {
            System.out.println(book.getNum()+"\t"+book.getCon()+"\t"+book.getName()+"\t\t"+book.getTime1());
        }
    }
}