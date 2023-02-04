package PreparedStatement_CRUD_PROJECT_1;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection 
{
		public static Connection getConnection() throws Exception
		{
			//Write Common Connection code here
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			
			return con;
		}
		
	
} 
	


