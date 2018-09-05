package pers.zeky.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCTest {

	public static void main(String[] args) {
		
		Connection con = null;
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://127.0.0.1:3306/mysql";
		//String url = "jdbc:mysql://localhost:3306/dbtrain1?";
				//+ "useConfigs=maxPerformance&characterEncoding=utf8&useSSL=false";
		String usr = "root";
		String pwd = "root";
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,usr,pwd);
			System.out.println(con);
			
			String sql = "select User from user";
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while(rs.next()){
				System.out.println(rs.getString("User"));
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Not found Driver!");
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			System.out.println("Exception process finished!");
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("close:"+e);
			}
		}
		
	}
	
}
