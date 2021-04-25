package main;

public class book {
   private String bookname;
   private String auth;
   private double price;
   private boolean isStatue;

    public book() {  //默认10本书
        this(10);
    }
    public book(int i) {
        //Person.books = new Book[i];
    }
    public book(String bookname, String auth, double price, boolean isStatue) {
        this.bookname = bookname;
        this.auth = auth;
        this.price = price;
        this.isStatue = isStatue;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean getIsStatue() {
        return isStatue;
    }

    public void setStatue(boolean statue) {
        isStatue = statue;
    }

    @Override
    public String toString() {
        return "书籍信息：" +"{"+
                "书名：" + bookname  +
                "，作者名：" + auth   +
                ", 价格：" + price +
                ", 是否在馆：" + isStatue +
                '}';
    }
}
