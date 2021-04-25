import java.util.Scanner;

public class BookManage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        图书数据初始化
        Book[] book = new Book[5];
        book[0] = new Book(1, "数据结构(C语言版)", "严蔚敏 吴伟民");
        book[1] = new Book(2, "线性代数", "陈育栎 曾怀杰");
        book[2] = new Book(3, "现代软件工程构建之法", "邹欣");
        book[3] = new Book(4, "Python数据分析与应用", "黄红梅 张良均");
        book[4] = new Book(5, "大数据技术原理与应用(第2版)", "林子雨");

        while (true) {
//            程序说明
            System.out.println("-------------------------------------------");
            System.out.println("欢迎使用图书管理程序，请输入所需功能(输入n以退出):");
//            功能说明
            System.out.println("1:图书查看");
            System.out.println("2:图书增加");
            System.out.println("3:图书删除");
            System.out.println("4:图书修改");
            System.out.println("5:图书推荐");
            System.out.println("-------------------------------------------");
//            输入n或N退出程序
            String ss = scanner.nextLine();
            if ("n".equals(ss.toLowerCase())) {
                break;
            }
//            初始化
            ManageFunction manageFunction = new ManageFunction();
//            判断输入信息对应调用功能
            switch (ss) {
                case "1":
                    System.out.println("图书查看功能:");
                    manageFunction.ShowBook(book);
                    break;
                case "2":
                    System.out.println("图书增加功能:");
                    book=manageFunction.AddBook(book);
                    break;
                case "3":
                    System.out.println("图书删除功能:");
                    book=ManageFunction.DeleteBook(book);
                    break;
                case "4":
                    System.out.println("图书修改功能:");
                    book=manageFunction.ChangeBook(book);
                    break;
                case "5":
                    System.out.println("图书推荐功能:");
                    manageFunction.BookAdvice(book);
                    break;
//                输入信息有误，报错并要求重新输入
                default:
                    System.out.println("输入信息有误，请重新输入！");
                    break;
            }
        }
//        退出信息
        System.out.println("程序已退出，欢迎下次使用。");
    }
}
