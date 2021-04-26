import java.util.Scanner;

public class mmain {
    public static void main(String[] args) {
        book[] books = new book[]{
                new book("构建之法","邹欣",69,true),
                new book("java基础案例教程","黑马程序员",54,true),
                new book("Spark基础编程","林子雨",49.8,true),
        };//默认的书籍
        for (int i =0;i<books.length;i++){
            System.out.println(books[i].toString());
        }
        alter(books);
    }


    // 补全方法，想好返回值，输入参数，方法名,挑自己的部分写
    // 2.图书增加功能
    // 3.图书删除功能
    // 4.图书修改功能
    public static void alter(book[] books) {
        int f = 0;
        System.out.println("请输入书名进行修改：");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        if(name != null) {
            for (int i = 0; i < books.length; i++) {
                if (books[i].getBookname().equals(name)) {
                    f = 1;
                    System.out.println("有此书籍！");
                    System.out.println("请输入修改后的作者名：");
                    String newauth = sc.next();
                    books[i].setAuth(newauth);
                    System.out.println("请输入修改后的价格：");
                    Double newprice = sc.nextDouble();
                    books[i].setPrice(newprice);
                    System.out.println("请输入修改后的状态：");
                    boolean newisStatue = sc.nextBoolean();
                    books[i].setisStatue(newisStatue);
                    System.out.println(books[i].toString());
                    break;
                }
            }
        }
        if(f == 0){
            System.out.println("暂时没有此书！");
        }
    }
    // 5.图书推荐功能(可以直接随机)
}
