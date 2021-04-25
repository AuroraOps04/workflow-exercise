import java.util.*;
public class Delete {
    Scanner input = new Scanner(System.in);
    private int i=1;
    List<Book> list = new ArrayList<>();
    Book book1=new Book(i++,"构建之法","可借",1,null, null);
    Book book2=new Book(i++,"NoSQL","可借",0,null, null);
    Book book3=new Book(i++,"Python","可借",0,null, null);
    public void Bookdelete() {         //图书删除功能
        boolean flag = false;
        System.out.print("请输入要删除的图书名：");
        String a=input.next();
        for (Book book : list) {
            if(book.getName().equals(a) && book.getCon()=="可借") {
                list.remove(book);
                System.out.println("删除《"+book.getName()+"》成功！");
                flag = true;
                break;
            }
            if(book.getName().equals(a) && book.getCon()=="借出"){
                flag = true;
                System.out.println("《"+book.getName()+"》为借出状态，不能删除。");
            }
        }
        if(flag == false){
            System.out.println("不存在该图书");
        }
    }

}
