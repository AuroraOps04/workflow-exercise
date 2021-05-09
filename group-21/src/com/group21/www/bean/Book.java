package com.group21.www.bean;

import java.util.List;

/**
 * 图书类
 *
 * @author 林朝玮
 */
public class Book {
    private String bookName;
    private String authorName;
    private boolean state;

    public Book(String bookName, String authorName, boolean state) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.state = state;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return this.bookName + "\t" + this.authorName + "\t" + this.state;
    }
}
