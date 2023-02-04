package JDBC_Day_2;

	import java.sql.Connection;
	import java.util.*;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class Student5 
	{
		public static void main(String[] args) throws ClassNotFoundException, SQLException 
		{
			//Step1:Load driver class
			Class.forName("com.mysql.jdbc.Driver");
				
			//Step2:Established Connectivity or Connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
				
			//Step3:Construct sql theory
			String sql=" insert into student values (800,'Munna','Mirzapur')";
			//String sql2=" insert into student values (660,'Dimpi','Sultanpur')";
			//String sql1=" insert into student values (200,'RatiShnakar','Jaunpur')";
			//String sql="create table student(Rollno int,Name varchar (500),Address varchar(700))";
			//String sql=("DELETE FROM student WHERE Rollno=200");
			//String sql1=("DELETE FROM student WHERE Rollno=500");
			//String sql= ("UPDATE student SET name='Pinki' and address='NaviMumbai' WHERE Rollno=660");
			//String sql1= ("UPDATE student SET col2='NaviMumabi' WHERE Rollno=500");
			
			//Step4:create statement object
			Statement smt= con.createStatement();
							
			//Step5:Submit sql Query
			smt.execute(sql);
			//smt.execute(sql1);
			//smt.execute(sql2);
			
			System.out.println("Inserted Data Sucessfully" +sql);
			//System.out.println("Inserted Data Sucessfully" +sql1);
			//System.out.println("Inserted Data Sucessfully" +sql2);
			
			//Step6:Close connection and Statement Object
			smt.close();
			con.close();
		}


	}

	
	

