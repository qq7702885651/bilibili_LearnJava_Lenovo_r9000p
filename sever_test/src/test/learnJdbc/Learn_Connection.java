package test.learnJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
//学习Connection api链接数据库
public class Learn_Connection {
    public static void main(String[] args) throws Exception{
        Mysql_user user = new Mysql_user();

        Connection conn = DriverManager.getConnection(user.getUrl(),user.getUsername(),user.getPassword());
        Statement stmt = conn.createStatement();

        //String sql1 = "update user set money = 3000 where id = 1";


        stmt.close();

    }
}
