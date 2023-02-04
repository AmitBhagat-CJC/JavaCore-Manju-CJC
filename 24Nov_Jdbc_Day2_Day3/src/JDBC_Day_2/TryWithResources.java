package JDBC_Day_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TryWithResources 
{
	public static void main(String[] args)throws ClassNotFoundException,SQLException
	{
		try
		{
			//Step1:Load driver class
			Class.forName("com.mysql.jdbc.Driver");
				
				
		//Step2:Established Connectivity or Connection
		try ( Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		
		//Step3:Construct sql Query
				
		//Step4:create statement object
		Statement smt= con.createStatement();
		
		//Step5:Submit sql Query
		ResultSet rs=smt.executeQuery(" select * from  studentdata");
				
		while(rs.next())
		{
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			
			System.out.println("Rollno");
			System.out.println("Name");
			System.out.println("Address");
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		//Step6:Close connection and Statement Object
				smt.close();
				con.close();
		
	}

}
