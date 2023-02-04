package JDBC_Day_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Scanner_Update 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		
		//Step1:Load Driver Class
		Class.forName("com.mysql.jdbc.Driver");
	
		//Step2:Established Connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
	
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Name");
		String name=sc.next();
		System.out.println("Enter Student Address");
		String address=sc.next();
		System.out.println("Enter Student Id");
		int id=sc.nextInt();
		

		//Step3:Construct SQL Query 
		String sql=("UPDATE student_2 SET ('"+name+"' and '"+address+"') WHERE "+id+");"
		
		//System.out.println(sql);
	
		//Step4:create statement object
		Statement smt=con.createStatement();
	
		//Step5:Submit SQL Query
		smt.execute(sql);
	
		//Step6:Close Connection and Statement Object
		smt.close();
		con.close();


	}
	

}
//