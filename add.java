package ja;

import java.awt.print.Book;
import java.util.Scanner;

// public class as {
//     public static void main(String[] args) {
//         System.out.println("abc");
//     }
// }
class book {
    private String bookname;
    private String auth;
    private double price;
    private boolean isStatue=true;

    public book() {  //默认10本书
        this(10);

    }
    public book(int i) {
        Book[] books = new Book[i];
    }
    public book(String bookname, String auth, double price, boolean isStatue) {
        this.bookname = bookname;
        this.auth = auth;
        this.price = price;
        this.isStatue = isStatue;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean getIsStatue() {
        return isStatue;
    }

    public void setIsStatue(boolean statue) {
        this.isStatue = statue;
    }
    public void add(Book[] books) {
        System.out.println("请输入书名：");
        Scanner sc = null;
        String name = sc.next();
        System.out.println("请输入作者：");
        String author = sc.next();
        System.out.println("请输入价格：");
        double price = sc.nextDouble();
        System.out.println("请输入分类：");
        String category = sc.next();





    }


    @Override
    public String toString() {
        return "书籍信息：" +"{"+
                "书名：" + bookname  +
                "，作者名：" + auth   +
                ", 价格：" + price +
                ", 是否在馆：" + isStatue +
                '}';
    }
}


class mmain {
    public static void main(String[] args) {
        book[] books = new book[]{
                new book("构建之法", "邹欣", 69, true),
                new book("java基础案例教程", "黑马程序员", 54, true),
                new book("Spark基础编程", "林子雨", 49.8, true),
                new book()
        };//默认的书籍

        mmain m=new mmain();
        m.add(books);
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].toString());
        }
    }
    // 补全方法，想好返回值，输入参数，方法名,挑自己的部分写
    //1.图书查看功能,
    // 2.图书增加功能
    // 3.图书删除功能
    // 4.图书修改功能
    // 5.图书推荐功能(可以直接随机)

    public void add(book[] books) {
        // System.out.println("请输入书名：");
        Scanner sc=new Scanner(System.in);
        String name = sc.next();
        System.out.println("请输入作者：");
        String author = sc.next();
        System.out.println("请输入价格：");
        double price = sc.nextDouble();

        for (int i = 0; i < books.length; i++) {
            if (books[i].getBookname() == null) {
                books[i].setBookname(name);
                books[i].setAuth(author);
                books[i].setPrice(price);
                books[i].setIsStatue(true);
                System.out.println("添加成功");
                break;
            }

        }

    }
}




