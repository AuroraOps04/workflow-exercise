import bean.BookInfo;

import java.util.List;
import java.util.Scanner;

/**
 * @Auther: jackyar
 * @Date: 2021/4/24 14:49
 * @Description: 主程序入口，用于展示所有功能
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        exitMenu:while(true){
            displayMenu();
            System.out.print("请输入您的选择：");
            int choiceIndex = sc.nextInt();
            switch (choiceIndex){
                case 1:
                    // 图书查看功能
                    queryFun();
                    break;
                case 2:
                    // 图书增加功能
                    addFun();
                    break;
                case 3:
                    // 图书删除功能
                    deleteFun();
                    break;
                case 4:
                    // 图书修改功能
                    updateFun();
                    break;
                case 5:
                    // 图书推荐功能
                    pushFun();
                    break;
                case 0:
                    System.out.println("成功退出！");
                    break exitMenu;
                default:
                    System.out.println("菜单索引无效，请重新输入！");
            }
            System.out.println();
        }
    }

    /**
     * 功能菜单
     */
    public static void displayMenu(){
        System.out.println("============图书管理功能===========");
        System.out.println("1、图书查看功能");
        System.out.println("2、图书增加功能");
        System.out.println("3、图书删除功能");
        System.out.println("4、图书修改功能");
        System.out.println("5、图书推荐功能");
        System.out.println("0、退出管理系统");
        System.out.println("==================================");
    }

    public static void queryFun(){
        List<BookInfo> infos = new BookInfoDaoImpl().queryBookDao();
        if (infos != null){
            for (BookInfo info : infos){
                System.out.println(info);
            }
        }
    }

    public static void addFun(){
        Scanner sc = new Scanner(System.in);
        System.out.println("=>图书名：");
        String name = sc.next();
        System.out.println("=>作者：");
        String author = sc.next();
        System.out.println("=>出版社：");
        String publish = sc.next();
        new BookInfoDaoImpl().addBookInfo(name,author,publish);
    }

    public static void deleteFun(){
        Scanner sc = new Scanner(System.in);
        System.out.println("=>图书名：");
        String name = sc.next();
        new BookInfoDaoImpl().deleteBookInfoByName(name);
    }

    public static void updateFun(){
        Scanner sc = new Scanner(System.in);
        System.out.println("=>图书名：");
        String name = sc.next();
        System.out.println("=>修改名：");
        String rename = sc.next();
        new BookInfoDaoImpl().updateBookInfoByName(name,rename);
    }

    public static void pushFun(){
        BookInfo info = new BookInfoDaoImpl().pushBook();
        System.out.println("==> 为您推荐的书籍：");
        System.out.println(info);
    }
}
