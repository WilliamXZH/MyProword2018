package pers.zeky.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.io.ObjectInputStream;

public class HybrisTest {

	public static void main(String[] args) {
		
		Connection con = null;
		String driver = "de.hybris.vjdbc.VirtualDriver";
		
		/* URL Format:jdbc:hybris:sql:http://localhost:9001/virtualjdbc/service */
		//String url = "jdbc:hybris:flexiblesearch:http://localhost:9001/virtualjdbc/service?tenant=master";
		String url = "jdbc:hybris:sql:http://localhost:9001/virtualjdbc/service?";
		String usr = "admin";
		String pwd = "nimda";
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,usr,pwd);
			System.out.println(con);
			
			String sql = "select * from {user}";
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while(rs.next()){
				System.out.println(rs.getString("p_name"));
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
