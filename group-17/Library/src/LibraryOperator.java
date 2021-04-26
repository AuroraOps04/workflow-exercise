import java.util.*;

public class LibraryOperator {
    Scanner scanner = new Scanner(System.in);

    //初始化“图书馆”
    InitializeBooks map = new InitializeBooks();

    //浏览
    public void scanBooks() {
        if(!map.books.isEmpty()) {
            for (Map.Entry<String, String> book : map.books.entrySet()) {
                System.out.println("书名：" + book.getKey() + " 作者：" + book.getValue());
            }
       }
    }
    //增加
    public void addBook(){
        System.out.print("请输入需要增加的书名：");
        String name = scanner.next();
        System.out.print("请输入需要增加书的作者：");
        String author = scanner.next();
        map.books.put(name,author);
        System.out.println("增加成功！");
    }
    //删除
    public void delBook(){
        scanBooks();
        System.out.print("请输入要删除书的名字");
        String name = scanner.next();
        if(map.books.containsKey(name)){
            map.books.remove(name);
            System.out.println("删除成功");
        } else{
            System.out.println("删除失败,书名不存在");
        }

    }
    //修改
    public void modBook(){
        System.out.print("请输入需要修改的书名：");
        String name = scanner.next();

        if(map.books.containsKey(name)){
            System.out.print("请输入需要修改的作者：");
            String author = scanner.next();

            map.books.put(name,author);

            System.out.println("修改成功");
        }else{
            System.out.println("没有找到此书");
        }
    }
    //推荐
    public void recBook(){
        ArrayList booknames = new ArrayList();
        booknames.addAll(map.books.keySet());
        System.out.println("系统为您推荐的书目为:");
        Random random = new Random();
        int index = random.nextInt(map.books.size());
        String key = String.valueOf(booknames.get(index));
        System.out.println("书名："+ key + " 作者："+ map.books.get(key));
    }
}
