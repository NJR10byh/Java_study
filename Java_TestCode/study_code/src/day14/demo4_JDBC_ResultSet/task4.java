package day14.demo4_JDBC_ResultSet;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author NJR10byh
 * @date 2022/8/2 14:26:21
 * @description JDBC Statement
 * <p>
 * ResultSet executeQuery(sql)：执行 DQL（对数据的 查 操作）
 * 返回值：ResultSet结果集对象
 */
public class task4 {
    @Test
    public void testResultSet() throws Exception {
        String databaseUrl = "jdbc:mysql://127.0.0.1:3306/db1";
        String username = "root";
        String password = "2283392byh";
        Connection connection = DriverManager.getConnection(databaseUrl, username, password);

        // 定义sql
        String sql1 = "SELECT * FROM account";

        // 获取执行sql的对象 Statement
        Statement statement = connection.createStatement();

        // 执行sql
        ResultSet resultSet = statement.executeQuery(sql1);
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            double money = resultSet.getDouble("money");

            System.out.println(id);
            System.out.println(name);
            System.out.println(money);

            System.out.println("-----------------------");
        }


        resultSet.close();
        statement.close();
        connection.close();
    }
}
