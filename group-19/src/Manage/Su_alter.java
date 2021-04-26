package Manage;
import java.util.Scanner;
//修改书籍
public class Su_alter {
    Scanner input = new Scanner(System.in);
    public void alterBOOK() {
        BOOK ddd = new BOOK();
        System.out.println("--->修改BOOK");
        System.out.println("请输入要修改的图书名称：");
        String name7 = input.next();
        int i = -1;
        for (BOOK d : book) {
            if (name7.equals(d.getName())) {
                System.out.println("请输入你要更新图书的id：");
                int id = input.nextInt();
                ddd.setId(id);
                System.out.println("请输入你要更新图书的名称：");
                String name = input.next();
                ddd.setName(name);
                System.out.println("请输入你要更新BOOK的借出情况：");
                String t = input.next();
                ddd.setStatus(t);
                System.out.println("请输入你要更新BOOK的借出时间：");
                String time = input.next();
                ddd.setBorrowTime(time);
                book.set(book.indexOf(d),ddd);
            }
        }
    }
}
