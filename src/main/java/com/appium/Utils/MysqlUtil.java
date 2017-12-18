package com.appium.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

public class MysqlUtil {
    private static String username = "root";
    private static String pws = "test";
    private static String url = "jdbc:mysql://192.168.1.51:3306/luffy";
    private static String driver = "com.mysql.jdbc.Driver";
    public static void main(String[] args){

    }


    //连接数据库
    public Connection getCon(){
        Connection connection = null;
        try{
            Class.forName(driver);
            connection = (Connection) DriverManager.getConnection(url,username,pws);
        }catch (Exception e){
            e.printStackTrace();
        }
        return connection;
    }
}
