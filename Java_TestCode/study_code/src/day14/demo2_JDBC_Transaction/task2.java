package day14.demo2_JDBC_Transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * @author NJR10byh
 * @date 2022/8/2 12:14:45
 * @description JDBC 事务管理
 */
public class task2 {
    public static void main(String[] args) throws Exception {
        String databaseUrl = "jdbc:mysql://127.0.0.1:3306/db1";
        String username = "root";
        String password = "2283392byh";
        Connection connection = DriverManager.getConnection(databaseUrl, username, password);

        // 获取执行sql的对象 Statement
        Statement statement = connection.createStatement();


        // 定义sql
        String sql1 = "UPDATE account SET money = 1000 WHERE id = 1";
        String sql2 = "UPDATE account SET money = 1000 WHERE id = 2";

        try {
            // 开启事务
            // setAutoCommit(): true为自动提交事务，false为手动提交事务（即开启事务）
            connection.setAutoCommit(false);
            int count1 = statement.executeUpdate(sql1);
            System.out.println(count1);

            int i = 3 / 0;

            int count2 = statement.executeUpdate(sql2);
            System.out.println(count2);

            // 如果代码执行到这里，说明还没有异常，可以执行
            connection.commit();
        } catch (Exception e) {
            System.out.println("出现异常，回滚事务");

            // 回滚事务
            connection.rollback();
            e.printStackTrace();
        }

        statement.close();
        connection.close();

    }
}
