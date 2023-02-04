package PreparedStatement_Student_1;
//S1:CREATE STUDENT TABLE 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class S1 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		//Step1:Load driver class
		Class.forName("com.mysql.jdbc.Driver");
			
		//Step2:Established Connectivity or Connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
		
		String yn=" ";
		do
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Table Name to Create");
			String TName=sc.next();
			
			//Step3:Construct sql theory
			String sql="CREATE TABLE student5(SRollno int,SName varchar (500),SAddress varchar(700),SMobile Int,SAge Int)";
				
			//Step4:create statement object
			Statement smt= con.createStatement();
			
			//Step5:Submit sql Query
			smt.execute(sql);
			System.out.println("Table Created Sucessfully:\n"+sql);
				
		
			//Step6:Close connection and Statement Object
//			smt.close();
//			con.close();
			System.out.println("Do you wants to continue?");
			yn=sc.next();
					
			}while(yn.equals("y")||yn.equals("Y"));
		}
}


