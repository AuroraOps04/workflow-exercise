import java.util.Arrays;
import java.util.Scanner;


public class ManageFunction {

    public ManageFunction() {
    }

    //    图书增加
    public static Book[] AddBook(Book[] books) {
        return books;
    }

    //    图书删除
    public static Book[] DeleteBook(Book[] books) {
        return books;
    }

    //    图书查看
    public static void ShowBook(Book[] books) {
        System.out.println("请输入需要搜索的书名");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        for (int i = 0; i < books.length; i++) {
            if (a.equals(books[i].getBookName())) {
                System.out.println(" booknum: "+books[i].getBooknum()+" 书名 "+books[i].getBookName()+" 作者 "+books[i].getWriter());
            }

        }
    }
    //    图书修改
    public static Book[] ChangeBook(Book[] books) {
        return books;
    }

    //    图书推荐
    public static void BookAdvice(Book[] books) {

    }

}

