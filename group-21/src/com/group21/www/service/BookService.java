package com.group21.www.service;

import com.group21.www.bean.Book;
import com.group21.www.dao.BookDao;

import java.util.List;
import java.util.Random;

public class BookService {
    private BookDao bookDao = new BookDao();

    /**
     * 获取所有图书信息
     *
     * @return 图书集合
     * @author 林朝玮
     */
    public List<Book> getTotalBooks() {
        return bookDao.getTotalBooks();
    }

    /**
     * 添加图书
     *
     * @param bookName   图书名
     * @param authorName 作者名
     * @return 增加图书是否成功
     * @author 林朝玮
     */
    public boolean addBook(String bookName, String authorName) {
        return bookDao.addBook(new Book(bookName, authorName, true));
    }

    /**
     * 删除图书
     *
     * @param bookName   图书名
     * @param authorName 作者名
     * @return 删除图书是否成功
     * @author 林朝玮
     */
    public boolean delBook(String bookName, String authorName) {
        return bookDao.delBook(bookName, authorName);
    }

    /**
     * 推荐图书
     *
     * @return 推荐的图书的集合
     * @author 林朝玮
     */
    public List<Book> recommendedBooks() {
        return bookDao.recommendedBooks();
    }

    /**
     * 根据书名查找图书
     *
     * @param bookName 图书名
     * @return 符合要求的图书集合
     * @author 林朝玮
     */
    public List<Book> findBookByBookName(String bookName) {
        return bookDao.findBookByBookName(bookName);
    }

    /**
     * 根据作者名查找图书
     *
     * @param authorName 作者名
     * @return 符合要求的图书集合
     * @author 林朝玮
     */
    public List<Book> findBookByAuthorName(String authorName) {
        return bookDao.findBookByAuthorName(authorName);
    }

    /**
     * 更新图书在架状态
     *
     * @param bookName   图书名
     * @param authorName 作者名
     * @return 更新状态是否成功
     * @author 林朝玮
     */
    public boolean updateState(String bookName, String authorName) {
        return bookDao.updateState(bookName, authorName);
    }
}
