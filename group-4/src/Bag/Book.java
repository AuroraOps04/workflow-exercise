package Bag;

public class Book {
    public   String id;
    public   String name;


    public String getId() {
        return id;
    }

    public String setId(String id) {
        this.id = id;
        return id;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public Book(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Book() {
    }
}
