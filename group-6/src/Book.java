public class Book {
    private int Booknum;
    private String BookName;
    private String Writer;

    public Book() {
    }

    public Book(int booknum, String bookName, String writer) {
        Booknum = booknum;
        BookName = bookName;
        Writer = writer;
    }

    public int getBooknum() {
        return Booknum;
    }

    public void setBooknum(int booknum) {
        Booknum = booknum;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public String getWriter() {
        return Writer;
    }

    public void setWriter(String writer) {
        Writer = writer;
    }

    @Override
    public String toString() {
        return Booknum + ":" + BookName + " 作者:" + Writer;
    }
}
