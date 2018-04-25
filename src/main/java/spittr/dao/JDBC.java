package spittr.dao;

import java.sql.*;

/**
 * Created by admin on 2018-03-26.
 */
public class JDBC {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://127.0.0.1:3306/clserp?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=UTC";
        String userName = "root";
        String password = "";
        String sql = "select * FROM cls_food";
        //1.加载驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2.获得数据库连接
        Connection conn = DriverManager.getConnection(url,userName,password);
        //3.通过连接对象获取操作对象
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()){
            System.out.println(resultSet.getString("FoodName"));
        }
        //4.依次关闭连接
        resultSet.close();
        statement.close();
        conn.close();
    }
}
