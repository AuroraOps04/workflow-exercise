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

    /**
     * 推荐图书
     *
     * @return 推荐的图书的集合
     * @author 蔡云龙
     */
    public List<Book> recommendedBooks(){
        List<Book> totalBooks = getTotalBooks();
        ArrayList<Book> books = new ArrayList<>();
        HashSet<Integer> integers = new HashSet<>();
        Random random = new Random();
        int cnt = 0;
        while (cnt == 0){
            cnt = random.nextInt(totalBooks.size());
        }
        while (integers.size() < cnt) {
            integers.add(random.nextInt(totalBooks.size()));
        }
        for (Integer integer : integers) {
            books.add(totalBooks.get(integer));
        }
        return books;
    }


    /**
     * 根据书名查找图书
     *
     * @param bookName 图书名
     * @return 符合要求的图书集合
     * @author 陈烨
     */
    public List<Book> findBookByBookName(String bookName){
        ArrayList<Book> books = new ArrayList<>();
        String queryStr = "select * from book where bookname = ?";
        Connection connection = DBconnection.getConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(queryStr);
            preparedStatement.setString(1,bookName);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                books.add(new Book(resultSet.getString("bookname"),resultSet.getString("authorname"),resultSet.getBoolean("state")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return books;
    }

    /**
     * 根据作者名查找图书
     *
     * @param authorName 作者名
     * @return 符合要求的图书集合
     * @author 陈烨
     */
    public List<Book> findBookByAuthorName(String authorName){
        ArrayList<Book> books = new ArrayList<>();
        String queryStr = "select * from book where authorname = ?";
        Connection connection = DBconnection.getConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(queryStr);
            preparedStatement.setString(1,authorName);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                books.add(new Book(resultSet.getString("bookname"),resultSet.getString("authorname"),resultSet.getBoolean("state")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return books;
    }

    public boolean updateState(String bookName, String authorName) {
        return false;
    }
}
