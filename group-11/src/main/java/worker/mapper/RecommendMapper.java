package worker.mapper;

import org.apache.ibatis.annotations.Mapper;
import worker.bean.Book;
import worker.bean.Recommend;

import java.util.List;

@Mapper
public interface RecommendMapper {
    List<Recommend> selectAll();
}