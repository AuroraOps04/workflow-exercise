import java.util.Scanner;

public class Menu {
    public static void loadMenu() {
        LibraryOperator libraryOperator = new LibraryOperator();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("--------------------");
            System.out.println("0.图书查看");
            System.out.println("1.图书增加");
            System.out.println("2.图书删除");
            System.out.println("3.图书修改");
            System.out.println("4.图书推荐");
            System.out.println("5.退   出");
            System.out.println("--------------------");
            System.out.print("请选择：");
            int input = scanner.nextInt();
            switch (input){
                case 0:
                    libraryOperator.scanBooks();
                    break;
                case 1:
                    libraryOperator.addBook();
                    break;
                case 2:
                    libraryOperator.delBook();
                    break;
                case 3:
                    libraryOperator.modBook();
                    break;
                case 4:
                    libraryOperator.recBook();
                    break;
                case 5:
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
