package BookManager;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.DataTruncation;
import java.text.SimpleDateFormat;
import java.util.*;
public void Bookback() {//实现归还book业务处理
        boolean flag = false;
        System.out.print("请输入你要归还的书的书名：");
        String a=input.next();
        for (Book book : list) {
            if(book.getName().equals(a) && book.getCon()=="可借") {
                System.out.println("《"+book.getName()+"》未借出,无需归还！");
                flag = true;
            }
            if(book.getName().equals(a) && book.getCon()=="借出") {
                System.out.print("请输入归还日期（年-月-日）：");
                String t=input.next();
                book.setTime2(t);//改变book的归还日期
                book.setCon("可借");//改变借出状态
                System.out.println("归还《"+book.getName()+"》成功！");
                System.out.println("借出日期为："+book.getTime1());
                System.out.println("归还日期为："+book.getTime2());
                flag = true;
                book.setTime1(null);
                break;
            }
        }
        if(flag == false) {
            System.out.println("不存在指定图书名");
        }
    }
    public void Bookpaihang() {//显示书籍借阅排行榜
        ArrayList<Book> list1 =new ArrayList();
        Iterator<Book> it1 = list.iterator();
        while(it1.hasNext()) {
            Book each = it1.next();
            list1.add(each);
        }
        Collections.sort(list1, new Comparator<Book>() {
            public int compare(Book o1, Book o2) {
                return o2.getCount()-o1.getCount();
            }
        });
        System.out.println("*************************");
        System.out.println("次数\t" + "名称");
        Iterator<Book> it = list1.iterator();
        while(it.hasNext()) {
            Book each = it.next();
            System.out.println(each.getCount() + "\t" + each.getName());
        }
        System.out.println("*************************");
    }