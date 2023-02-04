package JDBC_Day_2;
import java.util.*;
import java.sql.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.Scanner;

public class Dynamic_Input {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Step1:Load driver class
		Class.forName("com.mysql.jdbc.Driver");
		
		//Step2:Established Connectivity or Connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		
		int rollno=Integer.parseInt(args[0]);
		String name=args[1];
		String address=args[2];
		

		
		String sql=" insert into student6 values ("+rollno+",'"+name+"','"+address+"')";
		
		System.out.println(sql);
		Statement smt=con.createStatement();
		
		smt.execute(sql);
		
		smt.close();
		con.close();
		
		
	}

}
