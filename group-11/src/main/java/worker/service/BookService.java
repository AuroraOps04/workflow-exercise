package worker.service;

import worker.bean.Book;

import java.util.List;

public interface BookService{


    int deleteByPrimaryKey(Integer id);

    int insert(Book record);

    Book selectByPrimaryKey(Integer id);

    List<Book> selectAll();

    int updateByPrimaryKey(Book record);

}
