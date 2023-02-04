package JDBC_Day_2;

	import java.sql.*;
//	import java.sql.Connection;
//	import java.sql.DriverManager;
//	import java.sql.SQLException;
//	import java.sql.Statement;

	public class Professor
	{
		public static void main(String[] args) throws ClassNotFoundException, SQLException
		{
					//Step1:Load driver class
					Class.forName("com.mysql.jdbc.Driver");
						
					//Step2:Established Connectivity or Connection
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
						
					//Step3:Construct sql theory
					String sql=" insert into employee values (119,'Indrajeet',200,1234567891)";
					String sql1=" insert into employee values (112,'Atul',5500,95856532562)";
					String sql2=" insert into employee values (113,'Rahul',4500,52533523652)";
					String sql3=" insert into employee values (114,'shamu',500,5253554552)";
					String sql4=" insert into employee values (115,'Ramu',200,1234567891)";
					String sql5=" insert into employee values (116,'Radhe',5500,95856532562)";
					String sql6=" insert into employee values (117,'Swapnil',4500,52533523652)";
					String sql7=" insert into employee values (118,'AAmir',500,5253554552)";
					
					
					//Step4:create statement object
					Statement smt= con.createStatement();
						
					//Step5:Submit sql Query
					smt.execute(sql);
					smt.execute(sql1);
					smt.execute(sql2);
					smt.execute(sql3);
					smt.execute(sql4);
					smt.execute(sql5);
					smt.execute(sql6);
					smt.execute(sql7);
					
					
					System.out.println("Inserted Data Sucessfully" +sql);
					System.out.println("Inserted Data Sucessfully" +sql1);
					System.out.println("Inserted Data Sucessfully" +sql2);
					System.out.println("Inserted Data Sucessfully" +sql3);
					System.out.println("Inserted Data Sucessfully" +sql4);
					System.out.println("Inserted Data Sucessfully" +sql5);
					System.out.println("Inserted Data Sucessfully" +sql6);
					System.out.println("Inserted Data Sucessfully" +sql7);
						
					//Step6:Close connection and Statement Object
					smt.close();
					con.close();
		}

	}



