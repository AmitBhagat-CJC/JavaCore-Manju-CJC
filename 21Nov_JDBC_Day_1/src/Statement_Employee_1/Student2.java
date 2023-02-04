package Statement_Employee_1;
//Q:Write the jdbc program to delete student data those rollno=2.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Student2 
{

	
		public static void main(String[] args) throws ClassNotFoundException, SQLException 
		{
			//Step1:Load driver class
			Class.forName("com.mysql.jdbc.Driver");
				
			//Step2:Established Connectivity or Connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_test1","root","root");
				
			//Step3:Construct sql theory
			String sql=" insert into student2 values (900,'Amit','Pune')";
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
