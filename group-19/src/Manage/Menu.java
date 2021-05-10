package Manage;

import java.util.Scanner;

public class Menu {
    Shop shop = new Shop();

    public void start(Shop shop) {
        loadMenu(shop);
    }

    //菜单
    public void showMenu(Shop shop) {
        System.out.println("欢迎进入图书管理");
        System.out.println("------------------------");
        System.out.println("1.推荐书籍");
        System.out.println("2.新增书籍");
        System.out.println("3.查看书籍");
        System.out.println("4.删除书籍");
        System.out.println("5.修改书籍");
        System.out.println("6.退出");
        System.out.println("--------------------------");
    }

    Scanner input = new Scanner(System.in);
    // 选择菜单
    public void loadMenu(Shop shop) {
        boolean n = true;
        while (n) {
            showMenu(shop);
            System.out.print("请选择：");
            int choice = input.nextInt();
            if (choice == 6) {
                System.out.println("系统已退出");
                break;
	}
            switch (choice) {
                case 1:
                    shop.initialBOOK1();
                    shop.BOOKRank();
                    break;
                case 2:
                    shop.addBOOK();
                    break;
                case 3:
                    shop.listBOOK();
                    break;
                case 4:
                    shop.deleteBOOK();
                    break;
                case 5:
                    shop.alterBOOK();
                    break;
                default:
                    System.out.println("输入错误，请重试");
                    break;
            }
            System.out.println("********************");
            System.out.print("输入0返回菜单：");
            if (input.nextInt() == 0) {
                n = true;
            } else {
                n = false;
                System.out.println("请输入错误，系统已退出");
            }
        }
    }

}