package book;

import java.util.Scanner;

public class menu {
    static Scanner scanner = new Scanner(System.in);
    static booklist bookl=new booklist();
    public  static void loadMenu()
    {
        System.out.println("欢迎使用图书管理系统");
        while (true){
            System.out.println("----------------");
            System.out.println("0.图书清单");
            System.out.println("1.新增图书");
            System.out.println("2.查询图书");
            System.out.println("3.删除图书");
            System.out.println("4.借出图书");
            System.out.println("5.归还图书");
            System.out.println("6.保存图书");
            System.out.println("7.修改图书");
            System.out.println("-1.退出系统");
            System.out.println("----------------");
            System.out.print("请选择：");
            int input = scanner.nextInt();
            switch (input){
                case 0:
                    bookl.bookList();
                    break;
                case 1:
                    bookl.addBook();
                    break;
                case 2:
                    bookl.selectBook();
                    break;
                case 3:
                    bookl.deleteBook();
                    break;
                case 4:
                    bookl.lendBook();
                    break;
                case 5:
                    bookl.returnBook();
                    break;
                case 6:
                    bookl.saveBook();
                    break;
                case 7:
                    bookl.reviseBook();
                    break;
                case -1:
                    System.out.println("欢迎您下次使用");
                    return;
                default:
                    System.out.println("\n输入有误，请重新输入！\n\n");
            }
        }
    }
}
