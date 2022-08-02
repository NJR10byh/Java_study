package day14.demo5_JDBC_ResultSet_Account;

import day14.A_pojo.Account;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * @author NJR10byh
 * @date 2022/8/2 14:56:23
 * @description 查询 account 账户表数据，封装为 Account 对象中，并且存储到 ArrayList 集合中
 */
public class task5 {
    @Test
    public void testResultSet_Account() throws Exception {
        // 1、建立数据库连接
        String databaseUrl = "jdbc:mysql://127.0.0.1:3306/db1";
        String username = "root";
        String password = "2283392byh";
        Connection connection = DriverManager.getConnection(databaseUrl, username, password);

        // 2、定义sql
        String sql = "SELECT * FROM account";

        // 3、获取执行sql Statement
        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery(sql);

        ArrayList<Account> obj = new ArrayList<>();

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            double money = resultSet.getDouble("money");
            Account account = new Account(id, name, money);

            obj.add(account);
        }

        for (int i = 0; i < obj.size(); i++) {
            System.out.println(obj.get(i));
        }


        resultSet.close();
        statement.close();
        connection.close();
    }
}
