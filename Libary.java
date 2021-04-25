import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Libary {
    public static void showBooks(ArrayList<String> books){
        for (int i = 0; i < books.size(); i++) {
            System.out.print(books.get(i));
            System.out.println(" ");
        }
    }

    public static void showMenu(ArrayList<String> books){
        System.out.println("=========图书馆程序功能表=========");
        showBooks(books);
        System.out.println("          1.---------查看功能");
        System.out.println("          2.---------增加功能");
        System.out.println("          3.---------删除功能");
        System.out.println("          4.---------修改功能");
        System.out.println("          5.---------推荐功能");
        System.out.println("          0.---------结束");
        System.out.println("========================================");
        System.out.println("请输入选择：");
    }

    public static void menu(ArrayList<String> books){
        Scanner sc = new Scanner(System.in);
        incast:
        while (true){
            showMenu(books);
            boolean flag = true;
            while (true){
                while (flag){
                    int n = sc.nextInt();
                    if(n==0){
                        System.out.println("您已成功推出系统！");
                        break incast;
                    }else if(n==1){
                        lookup(books);
                        flag=false;
                    }else if(n==2){
                        add(books);
                        flag=false;
                    }else if(n==3){
                        delete(books);
                        flag=false;
                    }else if(n==4){
                        set(books);
                        flag=false;
                    }else if(n==5){
                        recommend(books);
                        flag=false;
                    }else {
                        System.out.println("输入错误，请重新选择");
                    }
                }
                System.out.println("请按回车键继续！");
                String stop = sc.nextLine();
                break;
            }
        }
    }

    public static void lookup(ArrayList<String> books){
//        陈思欣
    }

    public static void add(ArrayList<String> books){
//        罗宇欣
    }

    public static void delete(ArrayList<String> books){
//        周帮华
    }

    public static void set(ArrayList<String> books){
//        赵智兴
    }

    public static void recommend(ArrayList<String> books){
//        叶子文
    }

    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<>();
        menu(books);
    }
}
