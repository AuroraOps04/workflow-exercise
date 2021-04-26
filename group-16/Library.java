package pack;

import java.util.Scanner;

public class Library {

    Scanner sc = new Scanner(System.in);
    //登录函数：显示登录界面进行选择登录
    public void login() {
        int count = 0;
        Person p = null;
        while (count < 2) {
            System.out.println("===============图书管理系统===============");
            System.out.println("请登录：1.普通用户  2.管理员登录  3.退出系统");

            int n = sc.nextInt();
            //通过输入的值进行登录判断
            if (n == 3) {
                return;
            }
            switch (n) {
                case 1:
                    System.out.println("请输入姓名：");
                    String Uname = sc.next();
                    p = new User(Uname); //构造普通用户对象

                    System.out.println("登录成功！");
                    System.out.println("当前普通用户："+"姓名：" + p.getName());
                    //普通用户循环操作
                    while (true) {
                        System.out.println("请输入你的操作： 1.查询书籍  2.显示书籍列表 3.推荐 4.退出");
                        int i = sc.nextInt();
                        if (i >= 4) {
                            System.out.println("您已成功退出！");
                            break;
                        }else {
                            p.operate();  //调用普通用户的操作方法
                        }
                    }
                    break;
                case 2:
                    System.out.println("请输入管理员姓名：");
                    String Rname = sc.next();
                    p = new Root(Rname);//构造管理员对象

                    System.out.println("登录成功！");
                    System.out.println("当前管理员："+"姓名：" + p.getName() );
                    while (true) {
                        System.out.println("请输入你的操作： 1.查阅书籍 2.增加书籍 3.删除书籍 4.显示书籍列表 5.推荐 6.退出");
                        int j = sc.nextInt();
                        if (j >= 6) {
                            System.out.println("您已成功退出！");
                            break;
                        }else{
                            p.operate();//调用管理员的操作方法
                        }
                    } break;
            }
        }
    }
}
