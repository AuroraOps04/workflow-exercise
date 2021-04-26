package LibSys;

import java.util.Scanner;

public class MainInterface {

    public void mainInter(){
        Func func = new Func();
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("**********欢迎使用图书馆系统**********");
            System.out.println("              1.查看");
            System.out.println("              2.增加");
            System.out.println("              3.删除");
            System.out.println("              4.修改");
            System.out.println("              5.推荐");
            System.out.println("*************************************");
            int choose = input.nextInt();
            switch (choose) {
                case 1:
                    //查看
                    System.out.println("查看操作");
                    func.select();
                    break;
                case 2:
                    //增加
                    System.out.println("增加操作");
                    System.out.println("请输入要增加的书号和书名:");
                    String id2 = input.next();
                    String name2 = input.next();
                    func.add(id2,name2);
                    break;
                case 3:
                    //删除
                    System.out.println("删除操作");
                    System.out.print("请输入要删除的书号:");
                    String id3 = input.next();
                    func.delete(id3);
                    break;
                case 4:
                    //修改
                    System.out.println("修改操作");
                    System.out.print("请输入要修改的书号：");
                    String id4 = input.next();
                    System.out.print("请输入要修改后的书名：");
                    String name4 = input.next();
                    func.update(id4,name4);
                    break;
                case 5:
                    //推荐
                    System.out.println("推荐操作");
                    func.recommend();
                    break;
                default:
                    System.out.println("输入错误！");
                    break;
            }
            System.out.println("是否继续使用（y/n）");
            if(input.next().toUpperCase().equals("Y") != true) {
                break;
            }
        }while(true);
        System.out.println("正在退出系统 谢谢使用！");
    }
}
