package BookManager;

public class Book {
    private int num;//book编号
    private String name;//book名
    private String con;//book状态
    private int count;//借出次数
    private String time1;//借出时间
    private String time2;//归还时间
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCon() {
        return con;
    }
    public void setCon(String con) {
        this.con = con;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public String getTime1() {
        return time1;
    }
    public void setTime1(String time1) {
        this.time1 = time1;
    }
    public String getTime2() {
        return time2;
    }
    public void setTime2(String time2) {
        this.time2 = time2;
    }
    public Book() {

    }
    public Book(int num, String name, String con, int count, String time1, String time2) {
        this.num = num;
        this.name = name;
        this.con = con;
        this.count = count;
        this.time1 = time1;
        this.time2 = time2;
    }
}
