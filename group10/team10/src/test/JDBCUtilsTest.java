package test;

import org.junit.jupiter.api.Test;
import utils.JDBCUtils;

/**
 * @Auther: jackyar
 * @Date: 2021/4/24 15:05
 * @Description: 连接测试
 */
public class JDBCUtilsTest {

    @Test
    public void getConnection() {
        try {
            System.out.println(JDBCUtils.getConnection());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}