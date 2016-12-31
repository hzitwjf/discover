package com.hzit.dao;
/**
 * Created by Administrator on 2016/12/30.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.apache.commons.dbutils.QueryRunner;

public class GetConnection{
    protected  Connection connection;
    protected QueryRunner qr=new QueryRunner();
    public  Connection open() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://127.0.0.1:3306/decovre?useUnicode=true&characterEncoding=utf8";
            String user="root";
            String password="hzit";
            connection= DriverManager.getConnection(url, user, password);
	           /* System.out.println(connection.toString());
	            System.out.println(connection.isClosed());*/
            return  connection;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public  void close(Connection c,Statement s,ResultSet rs){
        if(rs!=null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (s!=null){
            try {
                s.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (c!=null){
            try {
                c.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public  void close(Connection c,PreparedStatement ps,ResultSet rs){
        if(rs!=null){
            try{
                rs.close();
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
        if (ps!=null){
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (c!=null){
            try {
                c.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
