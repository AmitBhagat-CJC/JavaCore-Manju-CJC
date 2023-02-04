package JDBC_Day_3_c;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class Test
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		College c=new College();
		List<Student>list=c.allStudentData();
		Class.forName("com.mysql.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		Statement smt=con.createStatement();
		for(Student stu:list)
		{
			String sql="insert into student6 values ("+stu.getRollno()+", '"+stu.getName()+"','"+stu.getAddress()+"')";
			System.out.println(sql);
			smt.execute(sql);
		
		}
		
	}

}
