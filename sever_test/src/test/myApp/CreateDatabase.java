package test.myApp;

import java.util.Scanner;

public class CreateDatabase {
    public static void main(String[] args) {

        System.out.println("欢迎使用自动mysql程序\n按1创建表格\n按2查看当前数据库表格");

        Scanner sc = new Scanner(System.in);
        String dy = sc.next();
        if(dy.equals("1")){
            System.out.print("请输入你要创建的表格名称");
        }
    }
}
