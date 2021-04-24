package test;

import bean.BookInfo;
import dao.BaseDao;
import org.testng.annotations.Test;

import java.util.List;

/**
 * @Auther: jackyar
 * @Date: 2021/4/24 15:31
 * @Description: 测试BaseDao
 */
public class BaseDaoTest {

    @Test
    public void update() {
        String sql = "INSERT INTO book_info(name,author)VALUES(?,?)";
        BaseDao dao = new BaseDao();
        System.out.println(dao.update(sql,"平凡的世界","路遥"));
    }

    @Test
    public void query(){
        String sql = "SELECT * FROM book_info WHERE id<=?";
        BaseDao baseDao = new BaseDao();
        List<BookInfo> list = baseDao.query(BookInfo.class, sql, 6);
        System.out.println(list);
    }
    @Test
    public void querySingleValue(){
        String sql = "SELECT COUNT(1) FROM book_info";
        BaseDao dao = new BaseDao();
        Object info = dao.querySingleValue(sql);
        System.out.println((Integer) info);
    }
}