package PreparedStatement_Employee_1;
////E3:DELETE DATA FROM EMPLOYEE TABLE
//Q2. Write the jdbc program to delete Employee data those data user wants to delete.
//(use keyboard input from user to delete perticular data) using prepared statement.

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class E3 {
	public static void main(String[] args) throws ClassNotFoundException,SQLException 
	{	
		//Step1:Load driver class
		Class.forName("com.mysql.jdbc.Driver");
		
		//Step2:Established Connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		String yn=" ";
		do
		{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee ID to Delete");
		int Eid=sc.nextInt();
//		System.out.println("Enter Student Name");
//		String Name=sc.next();
//		System.out.println("Enter Student Address");
//		String Address=sc.next();
		
//		Double esalary=sc.nextDouble();
//		System.out.println("Enter Employee Mobileno");
//		Long emob=sc.nextLong();
//		
		//Step3:Construct SQL Query
		//String sql=" insert into student_2 values (?,?,?)";
		//String sql="DELETE FROM employee  WHERE (Rollno=?)";
		String sql="DELETE FROM employee  WHERE (Eid=?)";
		//Step4:create PreparedStatement object		
		PreparedStatement ps= con.prepareStatement(sql);
		
		ps.setInt(1, Eid);
//		ps.setString(2, "govind");
//		ps.setString(3,"pune");
		
		//Step5:Submit SQL Query
		ps.execute();
		System.out.println("Sucessfully Deleted with condition WHERE (Eid=?)");
		
		//Step6:Close Connection and Statement Object
		
//		ps.close();
//		con.close();
		
		System.out.println("Do you wants to continue?");
		yn=sc.next();
				
		}while(yn.equals("y")||yn.equals("Y"));
	}

}
