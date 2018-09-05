package com.cn.org.ireport.test;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnection {
	 
	public static Connection getConnection(){
		try {
			 String url = "jdbc:mysql://localhost:3306/mysql";
			 Class.forName("org.gjt.mm.mysql.Driver");
			 Connection con = DriverManager.getConnection(url, "root", "root");
			 return con;
		 }catch(Exception e){
		 	 e. printStackTrace();
		 }
		 return null;
	}
}
