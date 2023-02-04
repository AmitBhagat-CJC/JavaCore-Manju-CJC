package Statement_Employee_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Student_Data 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		//Step1:Load driver class
		Class.forName("com.mysql.jdbc.Driver");
			
		//Step2:Established Connectivity or Connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_test2","root","root");
			
		//Step3:Construct sql theory
//		String sql="create table student_data(Rollno int,Name varchar (500),Address varchar(700))";
		String sql1=" insert into student_data values (1,'Amit','Pune')";
		
				
		//Step4:create statement object
		Statement smt= con.createStatement();
			
		//Step5:Submit sql Query
//		smt.execute(sql);
		smt.execute(sql1);
		
//		System.out.println("Created Table Sucessfully" +sql);
		System.out.println("Inserted Data Successfully" +sql1);
			
		//Step6:Close connection and Statement Object
		smt.close();
		con.close();
		}

}
