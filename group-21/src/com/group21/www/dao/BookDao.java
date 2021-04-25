package com.group21.www.dao;

import com.group21.www.utils.DBconnection;
import com.group21.www.bean.Book;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class BookDao {

    public List<Book> getTotalBooks() {
        return null;
    }


    public boolean addBook(Book book) {
        return false;
    }


    public boolean delBook(String bookName, String authorName) {
        return false;
    }


    public List<Book> recommendedBooks() {
        return null;
    }

    public List<Book> findBookByBookName(String bookName) {
        return null;
    }


    public List<Book> findBookByAuthorName(String authorName) {
        return null;
    }

    public boolean updateState(String bookName, String authorName) {
        return false;
    }
}
