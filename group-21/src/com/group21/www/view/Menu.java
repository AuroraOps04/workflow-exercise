package com.group21.www.view;

import com.group21.www.bean.Book;
import com.group21.www.service.BookService;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.List;
import java.util.Scanner;

/**
 * @author 林朝玮
 * 菜单类
 */
public class Menu {
    private static Scanner scanner = new Scanner(System.in);
    private static BookService bookService = new BookService();
    private static String bookName;
    private static String authorName;
    private static String choose = "";

    public static void start() {

        flag:
        while (true) {
            System.out.println("--------欢迎使用--------");
            System.out.println("0.图书查找");
            System.out.println("1.图书查看");
            System.out.println("2.图书增加");
            System.out.println("3.图书删除");
            System.out.println("4.状态修改");
            System.out.println("5.图书推荐");
            System.out.println("6.退出系统");
            System.out.println("------------------------");
            System.out.print("请选择您想使用的功能：");
            while (true) {
                choose = scanner.next();
                if ("".equals(choose) || !("0".equals(choose) || "1".equals(choose) || "2".equals(choose) || "3".equals(choose) || "4".equals(choose) || "5".equals(choose) || "6".equals(choose))) {
                    System.out.println("输入有误，请重新输入：");
                } else {
                    break;
                }
            }
            switch (choose) {
                case "6":
                    System.out.println("感谢您的使用，再见");
                    break flag;
                case "5":
                    bookService.recommendedBooks();
                    break;
                case "4":
                    bookService.updateState(bookName, authorName);
                    break;
                case "3":
                    bookService.delBook(bookName, authorName);
                    break;
                case "2":
                    bookService.addBook(bookName, authorName);
                    break;
                case "1":
                    bookService.getTotalBooks();
                    break;
                case "0":
                    break;
            }
        }
    }
}
