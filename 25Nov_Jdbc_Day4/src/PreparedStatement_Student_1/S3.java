package PreparedStatement_Student_1;
//S3:DELETE DATA FROM STUDENT TABLE
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

 
public class S3 {
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
			System.out.println("Enter Student Rollno to Delete");
			int SRollno=sc.nextInt();
//			System.out.println("Enter Student Name to Delete");
//			String SName=sc.next();
//			System.out.println("Enter Student Address to Delete");
//			String SAddress=sc.next();
//			System.out.println("Enter Studente MobileNo to Delete");
//			Long SMob=sc.nextLong();

		

			//Step3:Construct SQL Query
			String sql="DELETE FROM student8 WHERE (SRollno=?)";
			
			//Step4:create PreparedStatement object		
			PreparedStatement ps= con.prepareStatement(sql);
		
			ps.setInt(1, SRollno);
//			ps.setString(2, "govind");
//			ps.setString(3,"pune");
			
			//Step5:Submit SQL Query
			ps.execute();
			System.out.println("Sucessfully Deleted with condition WHERE (Rollno=?)");
			
			//Step6:Close Connection and Statement Object
//			ps.close();
//			con.close();
			
			System.out.println("Do you wants to continue?");
			yn=sc.next();
					
			}while(yn.equals("y")||yn.equals("Y"));
	}


}
