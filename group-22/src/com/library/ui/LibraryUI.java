package com.library.ui;

import com.library.util.BookUtil;

import java.util.Scanner;

public class LibraryUI {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String chose;
        do{
            System.out.println("\n***********************************************\n");
            System.out.println("*************学生信息管理系统******************\n");
            System.out.println("\t[1]添加图书信息\n");
            System.out.println("\t[2]修改图书信息\n");
            System.out.println("\t[3]查找图书信息\n");
            System.out.println("\t[4]删除图书信息\n");
            System.out.println("\t[5]图书推荐\n");
            System.out.println("\t[6]退出系统\n");
            System.out.println("***********************************************\n");
            System.out.println("***********************************************");

            System.out.println("请选择序号：");

            int x = s.nextInt();
            switch(x)
            {
                case 1 :
                    System.out.println(x);
                    BookUtil.insert();
                    break;
                case 2 :
                    BookUtil.updateInformation();
                    break;
                case 3 :
                    BookUtil.select();
                    break;
                case 4 :
                    BookUtil.deleteBook();
                    break;
                case 5 :
                    BookUtil.tui();
                    break;
                case 6 :
                    System.out.println("你已退出系统。");
                    exitSys();
                    break;
                default:System.exit(0);
            }

            System.out.println();
            System.out.println("是否继续？(yes or no)");

            chose = s.next();
        }while(chose.equals("yes"));

        System.out.println("你已退出系统，欢迎下次使用。");
        s.close();


    }

    public static void exitSys()
    {
        System.exit(0);
    }

}
