package BookManager;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.DataTruncation;
import java.text.SimpleDateFormat;
import java.util.*;
    public void Booksave() {
        FileWriter fw = null;
        try {//在D:\src目录下创建一个文本文件test.txt
            fw = new FileWriter("D:\\src\\test.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fw.write("序号\t状态\t名称\t\t借出日期\t借出次数\n");
            for (Book book : list) {//写入列表中的内容
                fw.append(book.getNum()+"\t"+book.getCon()+"\t"+book.getName()+"\t\t"+book.getTime1()+"\t"+book.getCount()+"\n");
            }
            fw.flush();//刷新
            fw.close();//关闭文件
        } catch (IOException e) {
            e.printStackTrace();
        }
    }