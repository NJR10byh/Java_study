package day14.demo3_JDBC_Statement;

/**
 * @author NJR10byh
 * @date 2022/8/2 14:05:28
 * @description JDBC Statement
 */

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * Ststement作用：
 * 1、执行SQL语句
 * int executeUpdate(sql)：执行 DML（对数据的 增、删、改 操作）、DDL（对数据库、表的 增、删、改、查 操作）语句
 * 返回值：（1）DML影响的行数；（2）DDL执行成功后，可能返回0
 * <p>
 * ResultSet executeQuery(sql)：执行 DQL（对数据的 查 操作）
 * 返回值：ResultSet结果集对象
 */
public class task3 {
    /**
     * @throws Exception
     */

    @Test
    public void testDML() throws Exception {
        String databaseUrl = "jdbc:mysql://127.0.0.1:3306/db1";
        String username = "root";
        String password = "2283392byh";
        Connection connection = DriverManager.getConnection(databaseUrl, username, password);

        // 获取执行sql的对象 Statement
        Statement statement = connection.createStatement();

        // 定义sql
        String sql1 = "UPDATE account SET money = 1000 WHERE id = 1";
        String sql2 = "UPDATE account SET money = 1000 WHERE id = 2";

        int count1 = statement.executeUpdate(sql1);
        int count2 = statement.executeUpdate(sql2);

        // 只有执行 DML 才能根据是否 大于0 来判断是否执行成功
        if (count1 > 0) {
            System.out.println("修改 id = 1 成功！");
        } else {
            System.out.println("修改失败！");
        }

        if (count2 > 0) {
            System.out.println("修改 id = 2 成功！");
        } else {
            System.out.println("修改失败！");
        }

        statement.close();
        connection.close();

    }
}
