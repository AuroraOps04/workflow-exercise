package pack;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Root extends Person implements operate {  //继承了人的类，需要重写它的抽象方法operate，实现了operate接口，需要重写接口内的方法

    private String Rname;

    public Root(String name) {
        super(name);//调用人基类的构造函数
    }

    Scanner sc = new Scanner(System.in);

    @Override
    public void operate() {   //管理员的操作
        System.out.print("请输入确认操作:");
        int i = sc.nextInt();

         if (i == 1) {//查
            select(books);

        } else if (i == 2) {//加
            add(books);

        } else if (i == 3) { //删
            delete(books);

        } else if (i == 4) {//列表
            list(books);

        } else if (i == 5) {//show
            show(books);

        } else {
            System.out.println("输入有误！");

        }
    }

    @Override
    public void select(Book[] books) {
        System.out.println("请输入书名进行查询：");
        String name = sc.next();
        if(name != null) {

            for (int i = 0; i < books.length; i++) {
                if (books[i].getName().equals(name)) {
                    System.out.print("书籍信息为：");
                    System.out.println(books[i].getName());
                    System.out.println("有此书籍！");

                    break;
                }
                System.out.println("暂时没有此书！");
                break;
            }
        }
    }

    @Override
    public void delete(Book[] books) {
        System.out.println("请输入要删除的书名:");
        String str = sc.next();
        if(str != null) {
            for(int i = 0;i<books.length;i++) {
                if(books[i].getName().equals(str)) {
                    books[i] = null;
                    System.out.println("删除成功！");
                    break;
                }
            }
        }
    }

    @Override
    public void add(Book[] books) {
        System.out.println("请输入书名：");
        String name = sc.next();


        for (int i = 0; i < books.length; i++) {
            if (books[i].getName() == null) {
                books[i].setName(name);
                System.out.println("添加成功");
                break;
            }
        }
    }

    @Override
    public void list (Book[]books){
        System.out.println("图书列表如下：书名");  //打印Book数组
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println(books[i].getName());
            }
        }
    }
    @Override
    public void show (Book[]books) {
        System.out.println("图书列表如下："+"\n"+"书名");  //打印Book数组

        int i=(int)(Math.random()*books.length);
        System.out.println(books[i].getName());
        }

}
