package test.learnJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
//学习Statement api操作数据库
public class Learn_Statement {
    public static void main(String[] args) throws Exception{

        Mysql_user user = new Mysql_user();

        Connection conn = DriverManager.getConnection(user.getUrl(),user.getUsername(),user.getPassword());

        Statement stmt = conn.createStatement();



        String sql1 = "update user set money = 4000 where id = 1";
        String sql2 = "update user set money = 4000 where id = 2";
        String sql3 = "update user set money = 4000 where id = 3";
        try {
            //开启事务
            conn.setAutoCommit(false);
            //执行sql
            int count1 = stmt.executeUpdate(sql1);
            //处理结果
            System.out.println(count1);
            
            int count2 = stmt.executeUpdate(sql2);
            System.out.println(count2);

            int count3 = stmt.executeUpdate(sql3);
            System.out.println(count3);

            conn.commit();
        }catch (Exception e){
            e.printStackTrace();
        }

        stmt.close();

    }
}
