package java0181.lesson7;

import java.sql.Connection;

public class Test {
    public static void main(String[] args){
        DeptDao deptDao=new DeptDao();
        deptDao.deleteById(3);
    }
}
