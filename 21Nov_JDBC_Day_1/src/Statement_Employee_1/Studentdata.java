package Statement_Employee_1;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;



public class Studentdata 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		//Step1:Load driver class
		Class.forName("com.mysql.jdbc.Driver");
			
		//Step2:Established Connectivity or Connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_test1","root","root");
			
		//Step3:Construct sql theory
		String sql=" insert into studentdata values (900,'Amit','Pune')";
		//String sql=" insert into studentdata values (800,'Varshapriya','Tumkur')";
			
		//Step4:create statement object
		Statement smt= con.createStatement();
			
		//Step5:Submit sql Query
		smt.execute(sql);
		System.out.println("Inserted Data Sucessfully" +sql);
			
		//Step6:Close connection and Statement Object
		smt.close();
		con.close();
		}

}
 