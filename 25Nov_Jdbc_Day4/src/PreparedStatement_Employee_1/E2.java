package PreparedStatement_Employee_1;
//E2:INSERT/ADD DATA INTO EMPLOYEE TABLE
//Q:1)Add/Insert the employee data into the database using prepared statement.
//Table name: employee
//Variables:
//int eid;
//String ename;
//double esalary;
//lond emob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class E2 
{
	public static void main(String[] args) throws ClassNotFoundException,SQLException 
	{	
		//Step1:Load driver class
		Class.forName("com.mysql.jdbc.Driver");
		
		//Step2:Established Connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		
		String yn=" ";
		do
		{
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Employee ID to Insert");
			int EId=sc.nextInt();
			System.out.println("Enter Employee Name to Insert");
			String EName=sc.next();
			System.out.println("Enter Employee Salary to Insert");
			Double ESalary=sc.nextDouble();
			System.out.println("Enter Employee MobileNo to Insert");
			Long EMob=sc.nextLong();
		
			//Step3:Construct SQL Query
			String sql=" insert into employee values (?,?,?,?)";
		
			//Step4:create PreparedStatement object		
			PreparedStatement ps= con.prepareStatement(sql);
		
			ps.setInt(1, EId);
			ps.setString(2, EName);
			ps.setDouble(3, ESalary);
			ps.setLong(4, EMob);
		
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
