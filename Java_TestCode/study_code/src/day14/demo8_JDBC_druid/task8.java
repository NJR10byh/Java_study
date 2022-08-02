package day14.demo8_JDBC_druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author NJR10byh
 * @date 2022/8/2 18:03:40
 * @description druid连接池
 */

public class task8 {
    public static void main(String[] args) throws Exception {
        System.out.println(System.getProperty("user.dir")); // 打印当前所在目录，方便导入相对路径

        // 1、导入jar包

        // 2、定义配置文件

        // 3、加载配置文件
        Properties prop = new Properties();
        prop.load(new FileInputStream("Java_TestCode/study_code/src/druid.properties"));

        // 4、获取连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);

        // 5、获取连接
        Connection connection = dataSource.getConnection();

        String sql = "select * from account";

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            System.out.println(resultSet.getInt("id"));
            System.out.println(resultSet.getString("name"));
            System.out.println(resultSet.getDouble("money"));

            System.out.println("------------------");
        }
    }
}
