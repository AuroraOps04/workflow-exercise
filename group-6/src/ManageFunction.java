import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ManageFunction {

    public ManageFunction() {
    }

    //    图书增加
    public static Book[] AddBook(Book[] books) {
        int n = books.length;
        System.out.println("请输入增加图书的书名：");
        String bookname = scanner.nextLine();
        System.out.println("请输入增加图书的作者：");
        String bookwriter = scanner.nextLine();
        Book[] newbooks = new Book[n + 1];
        for (int i = 0; i < n; i++) {
            newbooks[i] = books[i];
        }
        newbooks[n] = new Book(books.length, bookname, bookwriter);
        return newbooks;
    }

    //    图书删除
    public static Book[] DeleteBook(Book[] books) {
        System.out.println("查看现在图书：");
        ManageFunction.ShowBook(books);
        
        System.out.println("请输入要删除的图书序号：");
        int n=scanner.nextInt();
        Book[] newbooks=new Book[books.length-1];
        for (int i = 0,j=0; i < books.length; i++) {
            if (i!=n-1){
                newbooks[j]=books[i];
                newbooks[j].setBooknum(j+1);
                j++;
            }
        }
        return newbooks;
    }

    //    图书查看
    public static void ShowBook(Book[] books) {

    }

    //    图书修改
    public static Book[] ChangeBook(Book[] books) {
        Scanner input = new Scanner(System.in);
        //先显示全部数据供查看
        ManageFunction.ShowBook(books);
        System.out.print("请输入你要修改的图书id：");
        int n;
        n = input.nextInt();
        System.out.println(books[n - 1].getBooknum() + " " + books[n - 1].getBookName() + " " + books[n - 1].getWriter());
        System.out.print("请输入更新的图书名称：");
        String s1 = input.next();
        System.out.print("请输入更新的作者：");
        String s2 = input.next();
        books[n - 1].setBookName(s1);
        books[n - 1].setWriter(s2);
        return books;
    }

    //    图书推荐
    public static void BookAdvice(Book[] books) {
        Random random = new Random();
        int n = random.nextInt(books.length);
        System.out.println("书名：" + books[n].getBookName() + "\n作者：" + books[n].getWriter());
        System.out.println("推荐图书：");
    }

}

