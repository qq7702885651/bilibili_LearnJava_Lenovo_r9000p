package test.myApp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Jack {

    public static void main(String[] args) throws Exception{
        //注册驱动
        //Class.forName("com.mysql.jdbc.Driver");

        //
        String url = "jdbc:mysql://127.0.0.1:3306/db1?useSSL=false";
        String username = "root";
        String password = "admin";
        Connection conn = DriverManager.getConnection(url,username,password);
        //sql语句
        String sql = "create table aa(id int,name varchar(30),age int)";


//      Statement stmt = conn.createStatement();
//
//        int cont = stmt.executeUpdate(sql);

        conn.close();
    }
}
