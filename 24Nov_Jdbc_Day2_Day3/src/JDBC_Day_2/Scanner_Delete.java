package JDBC_Day_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import JDBC_Day_3_retrieve_data.Student;

public class Scanner_Delete 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
			//Step1:Load Driver Class
			Class.forName("com.mysql.jdbc.Driver");
			
			//Step2:Established Connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Employee Id");
			int eid=sc.nextInt();
	//		System.out.println("Enter Employee Name");
	//		String ename=sc.next();
	//		System.out.println("Enter Employee Salary");
	//		Double esalary=sc.nextDouble();
	//		System.out.println("Enter Employee Mobileno");
	//		Long emob=sc.nextLong();
			
			//Step3:Construct SQL Query 
			String sql="DELETE FROM employee WHERE  ("+eid+")";
			System.out.println(sql);
			
			//Step4:create statement object
			Statement smt=con.createStatement();
			
			//Step5:Submit SQL Query
			smt.execute(sql);
			
			//Step6:Close Connection and Statement Object
			smt.close();
			con.close();
		
		
	}


}


		
		
		
			
				
				

