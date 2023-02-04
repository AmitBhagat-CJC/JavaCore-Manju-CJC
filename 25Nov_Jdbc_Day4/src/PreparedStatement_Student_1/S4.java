package PreparedStatement_Student_1;
//S4: UPDATE DATA IN STUDENT TABLE 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class S4 
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
		System.out.println("Enter Sudent Rollno to Update");
		int SRollno=sc.nextInt();
		System.out.println("Enter Student Name to Update");
		String SName=sc.next();
		System.out.println("Enter Student Address to Update");
		String SAddress=sc.next();
		System.out.println("Enter Student MobileNo to Update");
		Long SMob=sc.nextLong();

		//Step3:Construct SQL Query
		String sql="UPDATE student6 SET SName=?, SMob=?,SAddress=?WHERE SRollno=?";
		
		
		//Step4:create PreparedStatement object		
		PreparedStatement ps= con.prepareStatement(sql);
		System.out.println(sql);
		
		ps.setString(2, SName);//---> Variables jaise set kiye hai Scanner me aur PreparedStament me wahi sequence rahega aaur  
		ps.setLong(4, SMob);			//--->WHERE condition me jo parameter hai wo subse pehele rahega
		ps.setString(3,SAddress);
		ps.setInt(1, SRollno); 						
		  								
		
		//Step5:Submit SQL Query
		ps.execute();
		System.out.println("Sucessfully Updated with condition WHERE (SRollno=?)");
		
		//Step6:Close Connection and Statement Object
//		ps.close();
//		con.close();
		System.out.println("Do you wants to continue?");
		yn=sc.next();
				
		}while(yn.equals("y")||yn.equals("Y"));
	}

}
