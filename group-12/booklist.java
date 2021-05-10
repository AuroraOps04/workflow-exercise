package book;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
public class booklist {
    Scanner scanner = new Scanner(System.in);
    List<book> list = new ArrayList<book>();

    public booklist(){

    }
    public void addBook() {
        System.out.println("---新增图书---");
        System.out.print("请输入图书名称：");
        String Name = scanner.next();
        int addid = list.size()+1;
        book b = new book(Name,addid);
        list.add(b);
        System.out.println("新增《"+Name+"》成功！");
    }

    public void selectBook(){
        System.out.println("---查找图书---");
        System.out.print("请输入查找图书名称：");
        String name = scanner.next();
        for (book b:list) {
            if (b.getName().equals(name)){
                System.out.println("图书"+name+b.getInout());
                return;
            }
        }
        System.out.println("未找到该图书，请确认输入是否正确");
    }
    public void deleteBook(){
        System.out.println("---删除图书---");
        System.out.print("请输入图书名称:");
        String name = scanner.next();
        for(book b:list) {
            if (b.getName().equals(name)) {
                if (b.isInout()){
                    int index = list.indexOf(b);
                    list.remove(index);
                    System.out.println("删除成功");
                    return;
                }else {
                    System.out.println("图书"+b.getName()+"已被"+b.getLendName()+"借出，不能删除");
                    return;
                }
            }
        }
        System.out.println("删除失败");
    }

    public void lendBook(){
        System.out.println("---借出图书---");
        System.out.println("请输入图书名称：");
        String name=scanner.next();
        for(book b:list){
            if (b.getName().equals(name)){
                if (b.isInout()){
                    System.out.println("输入借阅人名称");
                    String lendname=scanner.next();
                    b.setLendName(lendname);
                    b.setInout(false);
                    System.out.println("借阅成功");
                    return;
                }else {
                    System.out.println("已借出，借阅失败");
                }
            }
        }
        System.out.println("查无此书");

    }
    public void returnBook(){
        System.out.println("---归还图书---");
        System.out.print("请输入图书名称:");
        String name = scanner.next();
        for(book b:list){
            if (b.getName().equals(name)){
                if (b.isInout()){
                    System.out.println("图书未借出，归还失败");
                }else {
                    b.setInout(true);
                    b.setLendName(null);
                    System.out.println("归还成功");
                    return;
                }
            }
        }

    }
    public void reviseBook(){
        System.out.println("---修改图书---");
        System.out.println("输入修改图书名称：");
        String name = scanner.next();
        for(book b:list){
            if (b.getName().equals(name)){
                System.out.println("输入修改后的图书名称：");
                String rname = scanner.next();
                b.setName(rname);
                System.out.println("修改成功");
            }
        }
        System.out.println("未找到该图书");
    }
    public void bookList(){
        System.out.println("---图书清单---");
        System.out.println("编号\t名称\t状态");
        for (book b:list)
        {
            System.out.println(b.getId()+"\t" + b.getName()+"\t" + b.getInout()+"\t 借阅人："+b.getLendName());
        }
    }
    public void saveBook() {
        File file =new File("book.txt");
        Writer out;
        try {
            out = new FileWriter(file);
            out.write("编号\t名称\t状态");
            for(book b : list) {
                out.write("\r\n");
                out.write(b.getId()+"\t" + b.getName()+"\t" + b.getInout()+"\t 借阅人："+b.getLendName());
            }
            out.flush();
            out.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("保存成功！");
    }
}
