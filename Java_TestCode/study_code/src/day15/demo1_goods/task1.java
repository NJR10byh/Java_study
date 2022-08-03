package day15.demo1_goods;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Properties;

/**
 * @author NJR10byh
 * @date 2022/8/3 10:29:50
 * @description
 */

public class task1 {
    public static void main(String[] args) throws Exception {
        // 使用 druid 数据库连接池

        // 加载配置
        Properties prop = new Properties();
        prop.load(new FileInputStream("Java_TestCode/study_code/src/druid.properties"));

        // 利用数据资源工厂，创建数据资源
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);
        Connection connection = dataSource.getConnection();


        // 1、查询存放的商品对象
        Search_Goods(connection);

        // 2、查询存放的商品对象添加商品
//        Add_Goods(connection);

        // 3、根据id修改
//        Alter_Goods(connection);


        // 4、根据id删除
//        Delete_Goods(connection);

        // 释放资源
        connection.close();
    }

    // 1、查询存放的商品对象
    public static void Search_Goods(Connection connection) throws Exception {
        String search_goods = "select * from goods_info";

        // 使用 preparedStatement 防止SQL注入
        PreparedStatement preparedStatement = connection.prepareStatement(search_goods);
        ResultSet resultSet = preparedStatement.executeQuery();

        // 定义集合存放商品对象
        ArrayList<Goods_info> goods_info = new ArrayList<>();
        while (resultSet.next()) {
            Goods_info goods = new Goods_info();
            goods.setId(resultSet.getInt("id"));
            goods.setGoods_name(resultSet.getString("goods_name"));
            goods.setBrand(resultSet.getString("brand"));
            goods.setPrice(resultSet.getDouble("price"));
            goods.setDescription(resultSet.getString("description"));

            System.out.println(goods.toString());
            System.out.println("--------------------");
        }

        resultSet.close();
        preparedStatement.close();
    }

    // 2、添加商品
    public static void Add_Goods(Connection connection) throws Exception {
        String add_goods = "INSERT INTO goods_info (goods_name, brand, price, description ) VALUES ( ?, ?, ?, ? )";

        String goods_name = "AirPods Max";
        String brand = "Apple";
        Double price = 4399.00;
        String description = "细细品";
        PreparedStatement preparedStatement = connection.prepareStatement(add_goods);
        preparedStatement.setString(1, goods_name);
        preparedStatement.setString(2, brand);
        preparedStatement.setDouble(3, price);
        preparedStatement.setString(4, description);

        int rows = preparedStatement.executeUpdate();

        if (rows > 0) {
            System.out.println("添加成功！");
            System.out.println("受影响的行数：" + rows + " 行");
        }

        preparedStatement.close();
    }

    // 3、根据id修改
    public static void Alter_Goods(Connection connection) throws Exception {
        String alter_goods = "UPDATE goods_info SET description = ? WHERE id = ?";

        int id = 13;
        String description = "高保真音质";
        PreparedStatement preparedStatement = connection.prepareStatement(alter_goods);
        preparedStatement.setString(1, description);
        preparedStatement.setInt(2, id);

        int rows = preparedStatement.executeUpdate();

        if (rows > 0) {
            System.out.println("修改成功！");
            System.out.println("受影响的行数：" + rows + " 行");
        }

        preparedStatement.close();
    }

    // 4、根据id删除
    public static void Delete_Goods(Connection connection) throws Exception {
        String delete_goods = "DELETE FROM goods_info WHERE id = ?";

        int id = 13;
        PreparedStatement preparedStatement = connection.prepareStatement(delete_goods);
        preparedStatement.setInt(1, id);

        int rows = preparedStatement.executeUpdate();
        if (rows > 0) {
            System.out.println("删除成功！");
            System.out.println("受影响的行数：" + rows + " 行");
        }

        preparedStatement.close();
    }
}
