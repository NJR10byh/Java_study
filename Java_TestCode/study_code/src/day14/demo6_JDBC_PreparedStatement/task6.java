package day14.demo6_JDBC_PreparedStatement;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author NJR10byh
 * @date 2022/8/2 15:25:17
 * @description JDBC PreparedStatement（预编译） 运用及原理
 */
public class task6 {
    /**
     * useServerPrepStmts=true 开启预编译功能
     *
     * @throws Exception
     */
    @Test
    public void testResultSet_Account() throws Exception {
        // 1、建立数据库连接
        String databaseUrl = "jdbc:mysql://127.0.0.1:3306/db1?useServerPrepStmts=true";
        String username = "root";
        String password = "2283392byh";
        Connection connection = DriverManager.getConnection(databaseUrl, username, password);

        // 2、定义sql
        String sql = "SELECT * FROM userinfo WHERE username = ? AND password = ?";

        String userName = "zhangsan";
        String passWord = "12312";

        // 3、获取预编译sql preparedStatement
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setString(1, userName);
        preparedStatement.setString(2, passWord);

        ResultSet resultSet = preparedStatement.executeQuery();


        if (resultSet.next()) {
            System.out.println("登录成功！");
            System.out.println(resultSet.getString(1));
            System.out.println(resultSet.getString("password"));
        } else {
            System.out.println("登录失败！");
        }

        preparedStatement.close();
        connection.close();
    }
}
