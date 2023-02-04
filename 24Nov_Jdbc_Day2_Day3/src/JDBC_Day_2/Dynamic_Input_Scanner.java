package JDBC_Day_2;
//Q:1)Write the jdbc program for employee. Give the dynamic input and insert/add data into database.
//Table name : employee
//Variables:
//int eid;
//String ename;
//double esalary;
//long emob;

import java.util.*;
import java.sql.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.Scanner;

public class Dynamic_Input_Scanner {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//Step1:Load driver class
		Class.forName("com.mysql.jdbc.Driver");
		
		//Step2:Established Connectivity or Connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","root");
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Id");
		int eid=sc.nextInt();
		System.out.println("Enter Employee Name");
		String ename=sc.next();
		System.out.println("Enter Employee Salary");
		Double esalary=sc.nextDouble();
		System.out.println("Enter Employee Mobileno");
		Long emob=sc.nextLong();
		
		//Step3:Construct SQL Query
		String sql=" insert into employee values ("+eid+",'"+ename+"',"+esalary+","+emob+")";
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
