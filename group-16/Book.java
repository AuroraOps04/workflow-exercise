package pack;

class Book{
    private String name; //书名
    private boolean state; //状态  true-未借出  false-已借出

    //通过构造函数给定书的属性
    public Book(String name/*,String author,double price,String category*/,boolean state){
        this.name = name;
        this.state = state;
    }

    public Book() {  //默认10本书
        this(10);
    }
    public Book(int i) {
        Person.books = new Book[i];
    }

    //属性的获取和设置
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public void setState(boolean state) { this.state = state; }
}
