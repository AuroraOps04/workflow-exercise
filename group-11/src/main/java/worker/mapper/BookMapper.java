package worker.mapper;

import org.apache.ibatis.annotations.Mapper;
import worker.bean.Book;

import java.util.List;

@Mapper
public interface BookMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Book record);


    Book selectByPrimaryKey(Integer id);

    List<Book> selectAll();


    int updateByPrimaryKey(Book record);

}