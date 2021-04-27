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
