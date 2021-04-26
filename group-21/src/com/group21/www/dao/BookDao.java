package com.group21.www.dao;

import com.group21.www.utils.DBconnection;
import com.group21.www.bean.Book;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class BookDao {

    /**
     * 获取所有图书信息
     *
     * @return 图书集合
     * @author 王康靖
     */
    public List<Book> getTotalBooks() {
        ArrayList<Book> books = new ArrayList<>();
        String queryStr = "select * from book";
        Connection connection = DBconnection.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            preparedStatement = connection.prepareStatement(queryStr);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                books.add(new Book(resultSet.getString("bookname"), resultSet.getString("authorname"), resultSet.getBoolean("state")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
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
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return books;
    }


    /**
     * 添加图书
     *
     * @param bookName   图书名
     * @param authorName 作者名
     * @return 增加图书是否成功
     * @author 陈棋
     */
    public boolean addBook(Book book) {
        String addBookStr = "insert into book(bookname,authorname,state) values(?,?,?)";
        Connection connection = DBconnection.getConnection();
        PreparedStatement preparedStatement = null;
        boolean result = false;
        try {
            preparedStatement = connection.prepareStatement(addBookStr);
            preparedStatement.setString(1, book.getBookName());
            preparedStatement.setString(2, book.getAuthorName());
            preparedStatement.setBoolean(3, book.isState());
            int res = preparedStatement.executeUpdate();
            if (res > 0) {
                result = true;
            } else {
                result = false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
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


    /**
     * 删除图书
     *
     * @param bookName   图书名
     * @param authorName 作者名
     * @return
     * @author 林朝玮
     */
    public boolean delBook(String bookName, String authorName) {
        String delBookStr = "delete from book where bookname = ? and authorname = ?";
        Connection connection = DBconnection.getConnection();
        PreparedStatement preparedStatement = null;
        boolean result = false;
        try {
            preparedStatement = connection.prepareStatement(delBookStr);
            preparedStatement.setString(1, bookName);
            preparedStatement.setString(2, authorName);
            int res = preparedStatement.executeUpdate();
            if (res > 0) {
                result = true;
            } else {
                result = false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
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

    /**
     * 推荐图书
     *
     * @return 推荐的图书的集合
     * @author 蔡云龙
     */
    public List<Book> recommendedBooks() {
        List<Book> totalBooks = getTotalBooks();
        ArrayList<Book> books = new ArrayList<>();
        HashSet<Integer> integers = new HashSet<>();
        Random random = new Random();
        int cnt = 0;
        while (cnt == 0) {
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
    public List<Book> findBookByBookName(String bookName) {
        ArrayList<Book> books = new ArrayList<>();
        String queryStr = "select * from book where bookname = ?";
        Connection connection = DBconnection.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            preparedStatement = connection.prepareStatement(queryStr);
            preparedStatement.setString(1, bookName);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                books.add(new Book(resultSet.getString("bookname"), resultSet.getString("authorname"), resultSet.getBoolean("state")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
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
            if (resultSet != null) {
                try {
                    resultSet.close();
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
    public List<Book> findBookByAuthorName(String authorName) {
        ArrayList<Book> books = new ArrayList<>();
        String queryStr = "select * from book where authorname = ?";
        Connection connection = DBconnection.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            preparedStatement = connection.prepareStatement(queryStr);
            preparedStatement.setString(1, authorName);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                books.add(new Book(resultSet.getString("bookname"), resultSet.getString("authorname"), resultSet.getBoolean("state")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
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
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return books;
    }

    /**
     * 更新图书在架状态
     *
     * @param bookName   图书名
     * @param authorName 作者名
     * @return 更新状态是否成功
     * @author 曾国桢
     */
    public boolean updateState(String bookName, String authorName) {
        String updateStr = "update book set state = abs(state-1) where bookname = ? and authorname = ?";
        Connection connection = DBconnection.getConnection();
        PreparedStatement preparedStatement = null;
        boolean result = false;
        try {
            preparedStatement = connection.prepareStatement(updateStr);
            preparedStatement.setString(1, bookName);
            preparedStatement.setString(2, authorName);
            int res = preparedStatement.executeUpdate();
            if (res > 0) {
                result = true;
            } else {
                result = false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
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
}
