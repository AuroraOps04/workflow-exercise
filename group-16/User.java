package pack;

import java.util.Scanner;

class User extends Person implements operate {   //user类继承了人的类，  实现operate接口
    private String Uname;
    public User(String name) {
        super(name); //调用人基类的构造函数（派生类不继承基类的构造函数）
    }

    Scanner sc = new Scanner(System.in);

    public void operate() {  //普通用户的操作

        System.out.print("请输入确认操作:");
        int i = sc.nextInt();
        if (i == 1) {//select
            select(books);
        } else if (i == 2) {//书列表
            list(books);
        } else if (i == 3) {//show
            show(books);
        }

        else{
        System.out.println("输入有误！");

    }

}


    public void select(Book[] books) {
        System.out.println("请输入书名进行查询：");
        String name = sc.next();
        if (name != null) {
            int flag = 0;        //是否找到的标记位
            for (int i = 0; i < books.length; i++) {
                if (books[i].getName().equals(name)) {
                    System.out.print("有此书籍！:");
                    System.out.print(books[i].getName());
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) System.out.println("暂时没有此书！");
        }
    }


    public void delete(Book[] books) {
        System.out.println("请输入要借阅的书名:");
        String name = sc.next();
        if (name != null) {
            for (int i = 0; i < books.length - 1; i++) {
                if (books[i].getName().equals(name)) {  //借走书时设置状态为false
                    books[i].setState(false);
                    System.out.println("借阅成功！");
                    break;
                } else {               //没书
                    System.out.println("没有此书！");
                    break;
                }
            }
        }
    }



    public void add(Book[] books) {

        System.out.println("请输入要还的书名：");
        String name = sc.next();

        if (name != null) {
            for (int j = 0; j < books.length - 1; j++)
                if (books[j].getName().equals(name)) {
                    books[j].setState(true);
                    System.out.println("还书成功！");
                    break;
                }
        }
    }


    public void list(Book[] books) {
        System.out.println("图书列表如下：书名");  //打印Book数组
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println(books[i].getName());
            }
        }
    }

    public void show(Book[] books) {
        System.out.println("图书列表如下："+"\n"+"书名");  //打印Book数组

        int i=(int)(Math.random()*books.length);
        System.out.println(books[i].getName());
}
}

