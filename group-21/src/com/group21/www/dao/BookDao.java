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

    /**
     * 添加图书
     *
     * @param bookName   图书名
     * @param authorName 作者名
     * @return 增加图书是否成功
     * @author 陈棋
     */
    public boolean addBook(Book book){
        String addBookStr = "insert into book(bookname,authorname,state) values(?,?,?)";
        Connection connection = DBconnection.getConnection();
        PreparedStatement preparedStatement = null;
        boolean result = false;
        try {
            preparedStatement = connection.prepareStatement(addBookStr);
            preparedStatement.setString(1, book.getBookName());
            preparedStatement.setString(2, book.getAuthorName());
            preparedStatement.setBoolean(3,book.isState());
            int res = preparedStatement.executeUpdate();
            if (res > 0) {
                result = true;
            }else {
                result = false;
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
        return result;
    }


    public boolean delBook(String bookName, String authorName) {
        return false;
    }


    public List<Book> recommendedBooks() {
        return null;
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
