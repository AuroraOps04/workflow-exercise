package main;

import java.util.Scanner;

public class select {
    public void select(book[] books) {
        System.out.println("请输入书名进行查询：");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        if(name != null) {

            for (int i = 0; i < books.length; i++) {
                if (books[i].getBookname().equals(name)) {
                    System.out.println("有此书籍！");
                    System.out.println("书籍信息为：（书名-作者-价格-状态）");
                    System.out.println(books[i].getBookname() + "   "+books[i].getAuth() + "   "+books[i].getPrice() + "    "+books[i].getIsStatue());
                    break;
                }
                System.out.println("暂时没有此书！");
                break;
            }
        }
    }
}
