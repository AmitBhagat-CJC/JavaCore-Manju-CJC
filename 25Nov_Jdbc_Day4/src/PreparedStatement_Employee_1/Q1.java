package PreparedStatement_Employee_1;
//Q:1)Add/Insert the employee data into the database using prepared statement.

//Table name: employee
//Variables:
//int eid;
//String ename;
//double esalary;
//lond emob;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Q1 {
	public static void main(String[] args) throws ClassNotFoundException,SQLException 
	{	
		//Step1:Load driver class
		Class.forName("com.mysql.jdbc.Driver");
		
		//Step2:Established Connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		
		//Step3:Construct SQL Query
		String sql=" insert into employee values (?,?,?,?)";
		
		//Step4:create PreparedStatement object		
		PreparedStatement ps= con.prepareStatement(sql);
		
		ps.setInt(1, 22);
		ps.setString(2, "Dharmendra");
		ps.setDouble(3, 5500);
		ps.setLong(4, 1111111);
		
		//Step5:Submit SQL Query
		ps.execute();
		System.out.println("Sucessfully Added/Inserted");
		
		//Step6:Close Connection and Statement Object
		
		ps.close();
		con.close();
	}


}
