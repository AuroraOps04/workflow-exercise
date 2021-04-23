import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class LibraryOperator {
    Scanner scanner = new Scanner(System.in);
    InitializeBooks map = new InitializeBooks();
    //浏览
    public void scanBooks() {
        if(!map.books.isEmpty()) {
            Iterator it = map.books.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry obj = (Map.Entry) it.next();
                System.out.println("ID: "+obj.getKey()+" 书名："+obj.getValue());
            }
        }
    }
    //增加
    public void addBook(){

    }
    //删除
    public void delBook(){

    }
    //修改
    public void modBook(){
        System.out.print("请输入需要修改的书ID：");
        String ID = scanner.next();
        System.out.print("请输入需要修改的书名：");
        String name = scanner.next();

        if(map.books.containsKey(ID)){
            map.books.put(ID,name);
            System.out.println("修改成功");
        }else{
            System.out.println("没有找到此书");
        }
    }
    //推荐
    public void redBook(){

    }
}
