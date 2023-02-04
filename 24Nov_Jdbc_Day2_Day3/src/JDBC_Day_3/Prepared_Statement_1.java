package JDBC_Day_3;
import java.sql.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;



public class Prepared_Statement_1 
{
	public static void main(String[] args) throws ClassNotFoundException,SQLException 
	{	
		//Step1:Load driver class
		Class.forName("com.mysql.jdbc.Driver");
		
		//Step2:Established Connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
		
		//Step3:Construct SQL Query
		String sql=" insert into student_2 values (?,?,?)";
		
		//Step4:create PreparedStatement object		
		PreparedStatement ps= con.prepareStatement(sql);
		
		ps.setInt(1, 2);
		ps.setString(2, "Mahendra");
		ps.setString(3,"Chennai");
		
		//Step5:Submit SQL Query
		ps.execute();
		System.out.println("Sucessfully Added");
		
		//Step6:Close Connection and Statement Object
		
		ps.close();
		con.close();
	}

}


