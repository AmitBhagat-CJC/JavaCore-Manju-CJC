package JDBC_Day_3_retrieve_data;
import java.util.*;
import java.sql.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
//import java.util.List;

public class Test
{
	public static void main(String[] args) throws ClassNotFoundException,SQLException 
	{
		List<Student>liststu=new ArrayList<Student>();
		//Step1:Load Driver Class 
		Class.forName("com.mysql.jdbc.Driver");
				
		//Step2:Established Connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
		
		//Step3:Construct SQL Query
		String sql="SELECT * FROM student_2";  
		
		//Step4:create statement object
		Statement smt= con.createStatement();
		
		//Step5:Submit SQL Query
		ResultSet rs=smt.executeQuery(sql);
		while(rs.next())
		{
			Student stu=new Student ();
			stu.setRollno(rs.getInt(1));
			stu.setName(rs.getString(2));
			stu.setAddress(rs.getString(3));
			liststu.add(stu);
			
		}
		System.out.println(liststu);
		
		
				
		//Step6:Close Connection and Statement Object
				smt.close();
				con.close();
		
	}


}
