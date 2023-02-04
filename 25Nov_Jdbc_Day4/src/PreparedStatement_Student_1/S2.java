package PreparedStatement_Student_1;
// S2: INSERT/ADD DATA INTO STUDENT TABLE

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class S2 
{
	public static void main(String[] args) throws ClassNotFoundException,SQLException 
	{	
		//Step1:Load driver class
		Class.forName("com.mysql.jdbc.Driver");
		
		//Step2:Established Connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
		
		String yn=" ";
		do
		{
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Student Rollno to Insert");
			int SRollno=sc.nextInt();
			System.out.println("Enter Student Name to Insert");
			String SName=sc.next();
			System.out.println("Enter Student Address to Insert");
			String SAddress=sc.next();
			System.out.println("Enter Studente MobileNo to Insert");
			Long SMob=sc.nextLong();
			System.out.println("Enter Student Age to Insert");
			int SAge=sc.nextInt();
			//Step3:Construct SQL Query
			String sql=" insert into student6 values (?,?,?,?,?)";
			
			
			//Step4:create PreparedStatement object		
			PreparedStatement ps= con.prepareStatement(sql);
			System.out.println(sql);
			
			ps.setInt(1,SRollno);
			ps.setString(2, SName);
			ps.setString(3, SAddress);
			ps.setLong(4, SMob);
			ps.setInt(5, SAge);
		
			//Step5:Submit SQL Query
			ps.execute();
			System.out.println("Sucessfully Added/Inserted");
			
			//Step6:Close Connection and Statement Object
			
//			ps.close();
//			con.close();
			
		System.out.println("Do you wants to continue?");
		yn=sc.next();
				
		}while(yn.equals("y")||yn.equals("Y"));
		
	}
}



