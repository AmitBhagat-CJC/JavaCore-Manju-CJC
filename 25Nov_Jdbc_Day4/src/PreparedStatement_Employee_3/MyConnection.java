package PreparedStatement_Employee_3;

import java.sql.Connection;
import java.sql.*;
import java.sql.DriverManager;

public class MyConnection
{
	public static Connection getConnection() throws Exception
	{
		//Write Common Connection code here
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
		
		return con;
	}
}




