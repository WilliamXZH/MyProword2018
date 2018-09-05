package pers.zeky.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Project Name: Test
 * 
 * @Ttile: ODBCTest
 * @Description:
 * @author william zeky
 * @date: 2018年2月26日 上午11:24:10
 * 
 *        Modified By: william zeky Modified Time: %{date} 上午11:24:10 Modified
 *        Remarks:
 *
 * @version
 * @Copyright
 */
public class ODBCTest {
    public static void main(String[] args) {


        
        Connection con = null;
        String driver = "oracle.jdbc.driver.OracleDriver";
		// String url ="jdbc:oracle:oci:@localhost:1521:orcl";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		// String usr = "system";//zeky
		// String pwd = "root";//william
		String usr = "zeky";
		String pwd = "william";
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url,usr,pwd);
            System.out.println(con);
            
			String sql = "select * from class";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
			ResultSetMetaData metaData = (ResultSetMetaData) rs.getMetaData();
			int columnCount = metaData.getColumnCount();
            while(rs.next()){
				for (int i = 1; i <= columnCount; i++) {
					String columnName = metaData.getColumnLabel(i);
					System.out.print(columnName + '(' + rs.getString(columnName) + ')' + "\t");
				}
				System.out.println();
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
