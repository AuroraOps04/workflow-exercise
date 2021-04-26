package bk;

import java.util.ArrayList;
import java.util.Scanner;

public class addbook {
    public void addbook(ArrayList<Book> arr){
        Scanner sc = new Scanner(System.in);
        Book b = new Book();
        System.out.println("请输入要添加的书籍id");
        String id = sc.nextLine();
        b.setId(id);
        System.out.println("请输入要添加的书籍名字");
        String name = sc.nextLine();
        b.setName(name);
        arr.add(b);

    }
}
