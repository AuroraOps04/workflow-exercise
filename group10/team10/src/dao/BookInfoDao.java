package dao;

import bean.BookInfo;

import java.util.List;

/**
 * @Auther: jackyar
 * @Date: 2021/4/24 16:17
 * @Description: 图书操作功能
 */
public interface BookInfoDao {
    /**
     * 返回表中所有图书的数量, 主要提供给图书推荐功能使用
     * 根据该数量确定随机数范围
     * @return
     */
    public int countBookInfo();

    /**
     * 查询图书，显示所有图书信息
     * @return 返回图书集合
     */
    public List<BookInfo> queryBookDao();

    /**
     * 增加图书，把新增的图书信息写入数据库
     * @param name
     * @param author
     * @param publish
     * @return 返回-1添加失败，否则成功
     */
    public int addBookInfo(String name,String author,String publish);

    /**
     * 更具图书名称删除相应的图书记录
     * @param name
     * @return 返回-1删除失败，否则删除成功
     */
    public int deleteBookInfoByName(String name);

    /**
     * 图书修改功能，仅修改图书名称
     * @param name
     * @param rename
     * @return 返回-1修改失败，否则修改成功
     */
    public int updateBookInfoByName(String name, String rename);

    /**
     * 推荐图书，根据Random随机出一个图书ID
     * @return
     */
    public BookInfo pushBook();
}
