package demo;

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
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
			
		//Step3:Construct sql theory
		//String sql="CREATE TABLE student6(Rollno int,Name varchar (500),Address varchar(700),Mobile Int,Age Int)";
		
		String sql=" INSERT INTO student2 VALUES (500,'Munna','Mirzapur',911111111,35)";
		//String sql1=" insert into student2 values (200,'RatiShnakar','Jaunpur',922222222,45)";
		
		//String sql=("UPDATE student SET name='Rajesh' and address='NaviMumbai' WHERE Rollno=200");
		//String sql1= ("UPDATE student SET name='Pinki' and address='NaviMumbai' WHERE Rollno=500");
		
		//String sql=("DELETE FROM student2 WHERE Rollno=200");
		//String sql1=("DELETE FROM student2 WHERE Rollno=500");
		
		
		
		//Step4:create statement object
		Statement smt= con.createStatement();
			
		//Step5:Submit sql Query
		smt.execute(sql);
		//smt.execute(sql1);
		//smt.execute(sql2);
		
		System.out.println("Table Created Sucessfully:\n"+sql);
		//System.out.println("Inserted Data Sucessfully:\n"+sql1 );
		//System.out.println("Inserted Data Sucessfully:\n" +sql2);	
		//Step6:Close connection and Statement Object
		smt.close();
		con.close();
		}


}
