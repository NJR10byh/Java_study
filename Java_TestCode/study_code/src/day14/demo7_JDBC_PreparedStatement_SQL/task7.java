package day14.demo7_JDBC_PreparedStatement_SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author NJR10byh
 * @date 2022/8/2 17:25:10
 * @description PreparedStatement 防止 SQL 注入
 */

public class task7 {
    public static void main(String[] args) throws Exception {
        String databaseUrl = "jdbc:mysql://127.0.0.1:3306/db1?useServerPrepStmts=true";
        String username = "root";
        String password = "2283392byh";
        Connection connection = DriverManager.getConnection(databaseUrl, username, password);

        String userName = "zhangsan";
        String passWord = "' or '1' = '1";
        // 定义SQL
        String sql = "select * from userinfo where username = '" + userName + "' and password = '" + passWord + "'";

        System.out.println(sql); // select * from userinfo where username = 'zhangsan' and password = '' or '1' = '1'
        /**
         * select * from userinfo where username = 'zhangsan' and password = '' or '1' = '1'
         * username = 'zhangsan' and password = '' 结果为 false
         * '1' = '1' 结果为 true
         * false or true 结果为 true，所以登录成功
         */

        // 获取执行sql的 Statement
        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery(sql);

        if (resultSet.next()) {
            System.out.println("登录成功！");
        } else {
            System.out.println("登录失败！");
        }
    }
}
