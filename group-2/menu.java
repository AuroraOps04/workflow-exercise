package book;
import java.util.Scanner;
public class menu {
	static Scanner scanner = new Scanner(System.in);
    static shop shop = new shop();
    public static void loadMenu(){
        System.out.println("欢迎使用图书管理系统");
        while (true){
            System.out.println("----------------");
            System.out.println("0.借出排行榜");
            System.out.println("1.新增图书");
            System.out.println("2.查询图书");
            System.out.println("3.删除图书");
            System.out.println("4.借出图书");
            System.out.println("5.归还图书");
            System.out.println("6.保存图书");
            System.out.println("7.退出");
            System.out.println("----------------");
            System.out.print("请选择：");
            int input = scanner.nextInt();
            switch (input){
                case 0:
                    shop.borrowinglist();
                    break;
                case 1:
                    shop.addBook();
                    break;
                case 2:
                    shop.selectBook();
                    break;
                case 3:
                    shop.deleteBook();
                    break;
                case 4:
                    shop.lendBook();
                    break;
                case 5:
                    shop.returnBook();
                    break;
                case 6:
                    shop.saveBook();
                    break;
                case 7:
                    System.out.println("谢谢使用！");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\n输入有误，请重新输入！\n\n");
                    loadMenu();
            }
        }
    }
}

