package PreparedStatement_Employee_1;
//E4: UPDATE DATA IN STUDENT TABLE 
//Q3. Write the jdbc program to update Employee data those data user wants to update.
//(use keyboard input from user for updating) using prepared statement.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class E4 {
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
		System.out.println("Enter Employee ID to Update");
		int EId=sc.nextInt();
		System.out.println("Enter Employee Name to Update");
		String EName=sc.next();
		System.out.println("Enter Employee Salary to Update");
		Double ESalary=sc.nextDouble();
		System.out.println("Enter Employee MobileNo to Update");
		Long EMob=sc.nextLong();

		//Step3:Construct SQL Query
		String sql="UPDATE employee SET EName=?, EMob=?,ESalary=?WHERE Eid=?";
		
		
		//Step4:create PreparedStatement object		
		PreparedStatement ps= con.prepareStatement(sql);
		System.out.println(sql);
		
		ps.setString(1, EName);
		ps.setDouble(3, ESalary);;//---> sequence String sql me jo diya wahi rakho set karte huye jaise 1 pe Name, 2 pe Salary, 3 pe Mobileno
		ps.setLong(2, EMob); //--> 4 pe Eid 
		ps.setInt(4, EId);  //--> 4 ? ? ? ? mark hai kyu ki 4 variable hai . .5 variable rehete to 5 ????? hote
		
		//Step5:Submit SQL Query
		ps.execute();
		System.out.println("Sucessfully Updated with condition WHERE (Eid=?)");
		
		//Step6:Close Connection and Statement Object
//		ps.close();
//		con.close();
		System.out.println("Do you wants to continue?");
		yn=sc.next();
				
		}while(yn.equals("y")||yn.equals("Y"));
	}
	

}



//public static void main(String[] args) throws ClassNotFoundException, SQLException 
//{
//	
//	//Step1:Load Driver Class
//	Class.forName("com.mysql.jdbc.Driver");
//
//	//Step2:Established Connection
//	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
//
//
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter Student Rollno");
//	int id=sc.nextInt();
//	System.out.println("Enter Student Name");
//	String name=sc.next();
//	System.out.println("Enter Student Address");
//	String address=sc.next();
//	
//	
//
//	//Step3:Construct SQL Query 
//	String sql="UPDATE student_2 SET Name='"+name+"', Address='"+address+"' WHERE Rollno="+id+"";
//	System.out.println(sql);
//	
//
//	//Step4:create statement object
//	Statement smt=con.createStatement();


//	//Step5:Submit SQL Query
//	smt.execute(sql);
//	System.out.println("Sucessfully Updated");

//	Step6:Close Connection and Statement Object
//	smt.close();
//	con.close();

//
//
//}


//public static void main(String[] args) throws ClassNotFoundException, SQLException 
//{
//	
//	//Step1:Load Driver Class
//	Class.forName("com.mysql.jdbc.Driver");
//
//	//Step2:Established Connection
//	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
//
//
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter Student Rollno");
//	int id=sc.nextInt();
//	System.out.println("Enter Student Name");
//	String name=sc.next();
//	System.out.println("Enter Student Address");
//	String address=sc.next();
//	
//	
//
//	//Step3:Construct SQL Query 
//	String sql="UPDATE student_2 SET Name='"+name+"', Address='"+address+"' WHERE Rollno="+id+"";
//	System.out.println(sql);
//	
//
//	//Step4:create statement object
//	Statement smt=con.createStatement();
//
//	//Step5:Submit SQL Query
//	smt.execute(sql);
//	System.out.println("Sucessfully Updated");
//
//	//Step6:Close Connection and Statement Object
//	smt.close();
//	con.close();


//}







