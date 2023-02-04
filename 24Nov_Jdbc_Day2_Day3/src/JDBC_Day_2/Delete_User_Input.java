package JDBC_Day_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete_User_Input {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Step1:Load driver class
		Class.forName("com.mysql.jdbc.Driver");
		
		//Step2:Established Connectivity or Connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		
		int id=Integer.parseInt(args[0]);
		String name=args[1];
		double salary=Double.parseDouble(args[2]);
		long mob=Long.parseLong(args[3]);
		
			
		String sql=("DELETE FROM employee WHERE Rollno=16");
		
		System.out.println(sql);
		Statement smt=con.createStatement();
		
		smt.execute(sql);
		
		smt.close();
		con.close();
		
		
	}
}
//" insert into employee values ("+id+",'"+name+"',"+salary+","+mob+")"