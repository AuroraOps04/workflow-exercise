package com.library.domain;

public class Book {


    private int no;
    private String name;
    public Book(){
    }
    public Book(int no,String name)
    {
        this.no = no;
        this.name=name;
    }

    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


}
