package pack;

public interface operate{  //操作的接口
    void select(Book[] books); //查询，查阅
    void delete(Book[] books);//删除,借阅
    void add(Book[] books); //增加，还书
    void list(Book[] books); //显示书列表
    void show(Book[] books);
}

