package PreparedStatement_Student_2;
//Q6. Write the jdbc program to add student data into the database using prepared statement.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class University
{	
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		//Step1:Load driver class
		Class.forName("com.mysql.jdbc.Driver");
				
		//Step2:Established Connectivity or Connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
	
		for(int i=0;i<4;i++)
		{			
			//Set all Student data here(use keyboard input for student data) and add into the database using prepared statement.
			Scanner sc=new Scanner(System.in);
			Student stu=new Student();
			System.out.println("Enter Student Rollno");
			int SRollno=sc.nextInt();
			
			
			
			
			
		}
		
	
	
	}

	
	
	
	
	
}
