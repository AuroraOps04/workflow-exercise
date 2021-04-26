package LibSys;

public interface Funct {
    void add(String id, String name);     //增加
    void delete(String id);  //删除
    void update(String id, String name);  //更新
    void select();  //查看
    void recommend();//推荐
}
