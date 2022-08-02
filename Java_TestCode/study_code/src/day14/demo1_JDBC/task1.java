package day14.demo1_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * @author NJR10byh
 * @date 2022/8/2 9:45:48
 * @description JDBC
 */
public class task1 {
    public static void main(String[] args) throws Exception {

        // 注册驱动 （MySQL5 之后，可省略注册驱动）
        // Class.forName("com.mysql.cj.jdbc.Driver");

        // 获取链接
        String databaseUrl = "jdbc:mysql://127.0.0.1:3306/db1";
        String username = "root";
        String password = "2283392byh";
        Connection connection = DriverManager.getConnection(databaseUrl, username, password);

        // 定义sql语句
        String sql = "UPDATE account SET money = 1000 WHERE id = 1";

        // 获取执行sql的对象 Statement
        Statement statement = connection.createStatement();

        // 执行sql（ statement.executeUpdate(sql)会返回受影响的行数 ）
        int count = statement.executeUpdate(sql);
        System.out.println("受影响的行数：" + count);

        // 释放资源
        statement.close();
        connection.close();
    }
}
