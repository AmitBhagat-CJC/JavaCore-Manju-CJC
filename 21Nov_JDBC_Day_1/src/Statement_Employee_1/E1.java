package Statement_Employee_1;
//Q:Write the jdbc program to create table

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class E1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		//Step1:Load driver class
		Class.forName("com.mysql.jdbc.Driver");
			
		//Step2:Established Connectivity or Connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_test1","root","root");
			
		//Step3:Construct sql theory
		String sql="CREATE TABLE employee(EId int,EName varchar (500),EAddress varchar(700),EMobile Int,EAge Int)";
		
		//Step4:create statement object
		Statement smt= con.createStatement();
			
		//Step5:Submit sql Query
		smt.execute(sql);
		System.out.println("Created Table Sucessfully" +sql);
	
			
		//Step6:Close connection and Statement Object
		smt.close();
		con.close();
		}
		
}

