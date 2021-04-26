package BookManager;

import java.text.ParseException;
import java.util.Scanner;

public class Menu {
    public void loadMenu() throws ParseException {
        Methods methods=new Methods();
        methods.Bookadd();//初始化
        Scanner input = new Scanner(System.in);
        int b;
        do {
            System.out.println("欢迎使用图书管理系统");
            System.out.println("----------------------------");
            System.out.println("         0.借出排行榜");
            System.out.println("         1.新增图书");
            System.out.println("         2.查看图书");
            System.out.println("         3.删除图书");
            System.out.println("         4.借出图书");
            System.out.println("         5.归还图书");
            System.out.println("         6.退出并存储信息");
            System.out.println("----------------------------");
            System.out.print("请选择：");
            int a = input.nextInt();
            switch (a) {
                case 0:
                    System.out.println("-->借出排行榜");
                    methods.Bookpaihang();
                    break;
                case 1:
                    System.out.println("-->新增图书");
                    methods.Booknewadd();
                    break;
                case 2:
                    System.out.println("-->查看图书");
                    methods.Booklookall();
                    break;
                case 3:
                    System.out.println("-->删除图书");
                    methods.Bookdelete();
                    break;
                case 4:
                    System.out.println("-->借出图书");
                    methods.Bookload();
                    break;
                case 5:
                    System.out.println("-->归还图书");
                    methods.Bookback();
                    break;
                case 6:
                    System.out.println("-->退出");
                    System.out.println("你已退出系统，谢谢使用！");
                    methods.Booksave();
                    System.exit(0);
                    break;
                default:
                    System.out.println("你所选择的菜单有误！");
                    break;
            }
            System.out.print("输入0返回:");
            b= input.nextInt();
        }while(b==0);
        System.out.println("你未选择返回，系统退出！");
    }
}
