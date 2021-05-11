package java211808659.lesson06;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Scanner;
import java.sql.Statement;


public class bookinformation {
    // 连接对象
    private Connection conn;
    // 传递sql语句
    private Statement stt;
    // 结果集
    private ResultSet set;

    public void Add(){
        try {
            Connection conn=DBconnection.getConnection();// 获取连接
            if(conn==null)
                return;
            Scanner sc = new Scanner(System.in);
            System.out.print("书名：");
            String bookname=sc.nextLine();
            System.out.print("作者：");
            String bookwriter=sc.nextLine();
            //定义sql语句
            String sql = "insert into book values('"+bookname+"','"+bookwriter+"');";
            //获取Statement对象
            stt = conn.createStatement();
            //执行sql语句
            stt.executeUpdate(sql);
            System.out.println("任意键继续");
            String ting=sc.nextLine();//停一下
            menu();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            //释放资源
            try {
                conn.close();
            } catch (Exception e2) {}
        }
    }

    public void Delete(){
        try {
            Connection conn=DBconnection.getConnection();// 获取连接
            if(conn==null)
                return;
            //提示用户输入要删除的用户
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入删除的书籍名称:");
            String deletebookname = sc.nextLine();
            //定义sql语句
            String deleteSql = "delete from book WHERE bookname='"+deletebookname+"';";
            //获取Statement对象
            stt = conn.createStatement();
            //执行sql语句
            stt.executeUpdate(deleteSql);
            System.out.println("任意键继续");
            String ting=sc.nextLine();//停一下
            menu();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            //释放资源
            try {
                conn.close();
            } catch (Exception e2) {}
        }
    }

    public void Update(){
        try {
            Connection conn=DBconnection.getConnection();// 获取连接
            if(conn==null)
                return;
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入更新的书籍名称:");
            String updatebookname = sc.nextLine();
            System.out.print("请输入更新后的作者:");
            String updatebookwriter = sc.nextLine();
            //定义sql语句
            String updateSql = "update book set bookwriter= '"+updatebookwriter+"' WHERE bookname='"+updatebookname+"';";
            //获取Statement对象
            stt = conn.createStatement();
            //执行sql语句
            stt.executeUpdate(updateSql);
            System.out.println("任意键继续");
            String ting=sc.nextLine();//停一下
            menu();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            //释放资源
            try {
                conn.close();
            } catch (Exception e2) {}
        }
    }

    public void Select(){
        try {
            Connection conn=DBconnection.getConnection();// 获取连接
            if(conn==null)
                return;
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入查询的书籍名称:");
            String selectbookname = sc.nextLine();
            //定义sql语句
            String selectSql = "select * from book WHERE bookname='"+selectbookname+"';";
            //获取Statement对象
            stt = conn.createStatement();
            //执行sql语句
            set = stt.executeQuery(selectSql);
            while (set.next()) {

                System.out.println("书名:" + set.getString(1) + "\t作者:"
                        + set.getString(2));

            }
            System.out.println("任意键继续");
            String ting=sc.nextLine();//停一下
            menu();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            //释放资源
            try {
                conn.close();
            } catch (Exception e2) {}
        }
    }

    public void Random(){
        try {
            Connection conn=DBconnection.getConnection();// 获取连接
            if(conn==null)
                return;
            Scanner sc = new Scanner(System.in);
            System.out.println("为你推荐！");
            //定义sql语句
            String randomSql = "select * from book order by rand() limit 1;";
            //获取Statement对象
            stt = conn.createStatement();
            //执行sql语句
            set = stt.executeQuery(randomSql);
            while (set.next()) {

                System.out.println("书名:" + set.getString(1) + "\t作者:"
                        + set.getString(2));

            }
            System.out.println("任意键继续");
            String ting=sc.nextLine();//停一下
            menu();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            //释放资源
            try {
                conn.close();
            } catch (Exception e2) {}
        }
    }

    public void menu(){
        System.out.println("--------------------------------------------");
        System.out.println("-      至诚图书馆管理系统-叙利亚军事同盟         -");
        System.out.println("-             0-退出                        -");
        System.out.println("-             1-增加书籍                     -");
        System.out.println("-             2-删除书籍                     -");
        System.out.println("-             3-更新书籍                     -");
        System.out.println("-             4-查找书籍                     -");
        System.out.println("-             5-推荐书籍                     -");
        System.out.println("--------------------------------------------");
        Scanner sc =new Scanner(System.in);
        System.out.print("请输入数字：");
        int menu=sc.nextInt();
        switch(menu){
            case 0:
                System.exit(0);
            case 1:
                Add();
                break;
            case 2:
                Delete();
                break;
            case 3:
                Update();
                break;
            case 4:
                Select();
                break;
            case 5:
                Random();
                break;
        }
    }
}
