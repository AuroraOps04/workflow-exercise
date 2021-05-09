package dao;

import utils.JDBCUtils;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: jackyar
 * @Date: 2021/4/24 15:14
 * @Description: 数据库操作基本类
 */
public class BaseDao {
    /**
     * 封装对数据库增删改的通用操作
     * @param sql
     * @param args
     * @return -1 sql语句执行失败，否则执行成功
     */
    public int update(String sql, Object ...args){
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = JDBCUtils.getConnection();
            ps = conn.prepareStatement(sql);
            for (int i=0; i<args.length; i++){
                ps.setObject(i+1,args[i]);
            }
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.closeResources(conn,ps);
        }
        return -1;
    }

    /**
     * 抽象数据库中所有的查询操作
     * @param clazz 用于封装数据表的类对象
     * @param sql   需要执行SQL语句
     * @param args  语句中需要传入的参数
     * @param <T>   泛型参数
     * @return  返回null查询失败，否则查询成功
     */
    public <T> List<T> query(Class<T> clazz, String sql, Object ...args){
        ArrayList<T> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet resultSet = null;
        try {
            conn = JDBCUtils.getConnection();
            ps = conn.prepareStatement(sql);
            for (int i=0; i<args.length; i++){
                ps.setObject(i+1, args[i]);
            }
            resultSet = ps.executeQuery();
            ResultSetMetaData metaData = resultSet.getMetaData();
            int count = metaData.getColumnCount();
            while (resultSet.next()){
                T t = clazz.newInstance();
                for (int i=0; i<count; i++){
                    Object value = resultSet.getObject(i + 1);
                    String lab = metaData.getColumnLabel(i + 1);
                    Field field = clazz.getDeclaredField(lab);
                    field.setAccessible(true);
                    field.set(t, value);
                }
                list.add(t);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.closeResources(conn,ps,resultSet);
        }
        return null;
    }

    /**
     * 查询表中单值数据，主要由count()统计出的数值
     * @param sql
     * @param args
     * @return 返回-1查询失败，否则查询成功
     */
    public int querySingleValue(String sql, Object ...args){
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet resultSet = null;
        try {
            conn = JDBCUtils.getConnection();
            ps = conn.prepareStatement(sql);
            for (int i=0; i<args.length; i++){
                ps.setObject(i+1,args[i]);
            }
            resultSet = ps.executeQuery();
            resultSet.next();
            return resultSet.getInt(1);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.closeResources(conn,ps,resultSet);
        }
        return  -1;
    }
}