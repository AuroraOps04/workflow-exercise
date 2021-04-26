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
                    List<Book> books = bookService.recommendedBooks();
                    if (books == null || books.size() == 0) {
                        System.out.println("无数据");
                    } else {
                        System.out.println("书名\t作者名\t在架状态");
                        for (Book book : books) {
                            System.out.println(book);
                        }
                    }
                    break;
                case "4":
                    System.out.print("请输入书名：");
                    bookName = scanner.next();
                    System.out.print("请输入作者名：");
                    authorName = scanner.next();
                    if (bookService.updateState(bookName, authorName)) {
                        System.out.println("更新成功！");
                    } else {
                        System.out.println("更新失败！");
                    }
                    break;
                case "3":
                    System.out.print("请输入书名：");
                    bookName = scanner.next();
                    System.out.print("请输入作者名：");
                    authorName = scanner.next();
                    if (bookService.delBook(bookName, authorName)) {
                        System.out.println("删除成功！");
                    } else {
                        System.out.println("删除失败！");
                    }
                    break;
                case "2":
                    System.out.print("请输入书名：");
                    bookName = scanner.next();
                    System.out.print("请输入作者名：");
                    authorName = scanner.next();
                    if (bookService.addBook(bookName, authorName)) {
                        System.out.println("添加成功！");
                    } else {
                        System.out.println("添加失败！");
                    }
                    break;
                case "1":
                    List<Book> totalBooks = bookService.getTotalBooks();
                    if (totalBooks == null || totalBooks.size() == 0) {
                        System.out.println("无数据");
                    } else {
                        System.out.println("书名\t作者名\t在架状态");
                        for (Book book : totalBooks) {
                            System.out.println(book);
                        }
                    }
                    break;
                case "0":


                    System.out.println("[1].按书名查找");
                    System.out.println("[2].按作者名查找");
                    System.out.print("请选择：");
                    while (true) {
                        choose = scanner.next();
                        if ("".equals(choose) || !("1".equals(choose) || "2".equals(choose))) {
                            System.out.println("输入有误，请重新输入：");
                        } else {
                            break;
                        }
                    }
                    switch (choose) {
                        case "1":
                            System.out.print("请输入书名：");
                            bookName = scanner.next();
                            List<Book> bookByBookName = bookService.findBookByBookName(bookName);
                            if (bookByBookName == null || bookByBookName.size() == 0) {
                                System.out.println("无数据");
                            } else {
                                System.out.println("书名\t作者名\t在架状态");
                                for (Book book : bookByBookName) {
                                    System.out.println(book);
                                }
                            }
                            break;
                        case "2":
                            System.out.print("请输入作者名：");
                            authorName = scanner.next();
                            List<Book> bookByAuthorName = bookService.findBookByAuthorName(authorName);
                            if (bookByAuthorName == null || bookByAuthorName.size() == 0) {
                                System.out.println("无数据");
                            } else {
                                System.out.println("书名\t作者名\t在架状态");
                                for (Book book : bookByAuthorName) {
                                    System.out.println(book);
                                }
                            }
                            break;
                    }
                    break;
            }
        }
    }
}
