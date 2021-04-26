package bean;

/**
 * @Auther: jackyar
 * @Date: 2021/4/24 16:03
 * @Description: 图书类，用于封装数据库中的book_info表
 */
public class BookInfo {
    private int id;         // 索引ID
    private String name;    // 图书名
    private String author;  // 作者
    private String publish; // 图书出版社

    public BookInfo() {
    }

    public BookInfo(int id, String name, String author, String publish) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publish = publish;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    @Override
    public String toString() {
        return "BookInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publish='" + publish + '\'' +
                '}';
    }
}
