import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Libary {
    public static void showBooks(ArrayList<String> books){
        for (int i = 0; i < books.size(); i++) {
            System.out.print((i+1) + ". " + books.get(i));
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
        System.out.println("请输入您要查阅的书籍：");
        Scanner sc = new Scanner(System.in);
        String bookname = sc.next();
        incast1:
        if(books.size()==0){
            System.out.println("书库中还没有书籍！");
        }else {
            for (int i = 0; i < books.size(); i++) {
                if (books.get(i).equals(bookname)){
                    System.out.println("您要查阅的是书库的第"+(i+1)+"本书！");
                    break incast1;
                }else {
                    continue;
                }
            }
            System.out.println("书库中没有找到您要查找的书籍！");
        }
    }

    public static void add(ArrayList<String> books){
//        罗宇欣
        System.out.println("请输入您要增加的书籍名称：");
        Scanner sc = new Scanner(System.in);
        String bookname = sc.next();
        incast3:
        if(false){

        }else {
            for (int i = 0; i < books.size(); i++) {
                if (books.get(i).equals(bookname)){
                    System.out.println("书库中已经有这本书了！");
                    break incast3;
                }else {
                    continue;
                }
            }
            books.add(bookname);
            System.out.println("您已成功加入新的书籍！");
            showBooks(books);
        }
    }

    public static void delete(ArrayList<String> books){
//        周帮华
        System.out.println("请输入您要删除的书籍名称：");
        Scanner sc = new Scanner(System.in);
        String bookname = sc.next();
        incast2:
        if(books.size()==0){
            System.out.println("书库中还没有书籍！");
        }else {
            for (int i = 0; i < books.size(); i++) {
            if (books.get(i).equals(bookname)){
                books.remove(bookname);
                System.out.println("您已成功删除书籍"+bookname);
                break incast2;
            }else {
                continue;
            }
            }
            System.out.println("书库中无此书！");
        }

    }

    public static void set(ArrayList<String> books){
//        赵智兴
        if(books.size()==0){
            System.out.println("书库中无书籍，请添加后重试！");
        } else {
            System.out.println("请输入您要修改的书籍名称：");
            Scanner sc = new Scanner(System.in);
            String bookname = sc.next();
            System.out.println("请输入您要修改的书籍位置：");
            int position = sc.nextInt()-1;
            if(position>=books.size()){
                System.out.println("此位置无书籍！");
            }else {
                books.set(position,bookname);
                System.out.println("修改成功！");
            }
        }
    }

    public static void recommend(ArrayList<String> books){
//        叶子文
        Random r = new Random();
        int n;
        if(books.size()+1<3){
            System.out.println("书籍太少，不做推荐");
        }else {
                n = r.nextInt(books.size());
                System.out.println("推荐书籍："+books.get(n));
            }
        }

    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<>();
        menu(books);
    }
}
