package JDBC_Day_2;
//Q:2)Write the jdbc program to delete student data those data user wants to delete.

//(use dynamic input from user to delete perticular data).

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Q2 
{

public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//Step1:Load driver class
		Class.forName("com.mysql.jdbc.Driver");
		
		//Step2:Established Connectivity or Connection
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
		
		String sql="DELETE FROM studentdata2 WHERE  (rollno="+eid+")";
		
		System.out.println(sql);
		Statement smt=con.createStatement();
		
		smt.execute(sql);
		
		smt.close();
		con.close();
		
		
	}

	
	}
		
	



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	//Step1:Load driver class
//			Class.forName("com.mysql.jdbc.Driver");
//			
//			//Step2:Established Connectivity or Connection
//			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
//			
//			int id=Integer.parseInt(args[0]);
//			String name=args[1];
//			double salary=Double.parseDouble(args[2]);
//			long mob=Long.parseLong(args[3]);
//			
//				
//			String sql="DELETE FROM student WHERE eid=22";
//			System.out.println(sql);
//			Statement smt=con.createStatement();
//			
//			smt.execute(sql);
//			
//			smt.close();
//			con.close();
//			
//			
//		}