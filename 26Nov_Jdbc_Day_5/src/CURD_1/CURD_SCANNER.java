package CURD_1;
//Q:CURD SCANNER CREATE_UPDATE_RETRIEVE_DELETE 
import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CURD_SCANNER 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		//Step1:Load driver class
		Class.forName("com.mysql.jdbc.Driver");
			
		//Step2:Established  Connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("-----SELECT----"+"\n1.Create Table \n2.Update \n3.Retrieve \n4.Delete \n5.Insert");
		int s=sc.nextInt();
		
		switch(s)
		{
			case 1:
				//Create Table
				String sql="CREATE TABLE student12(SRollno int,SName varchar (500),SAddress varchar(700),SMobile Int)";
				Statement smt= con.createStatement();
				smt.execute(sql);
				System.out.println("Table Created Sucessfully");
				break;
			case 5:
				//INSERT/ADD Table
				String sql4=" insert into student1 values (900,'Amit','Pune',8965896)";
				Statement smt4= con.createStatement();
				smt4.execute(sql4);
				System.out.println("Table Inserted Sucessfully");
				break;
				
			case 2:
				//Update Table
				String sql1="UPDATE student10 SET SName=20,SAddress=Pune,SMob=12365,WHERE SRollno=?";
				Statement smt1= con.createStatement();
				smt1.execute(sql1);
				System.out.println("Table Updated Sucessfully");
				break;
				
			case 3:
				//SELECT/Retrieve Table
				String sql2="SELECT * FROM student10";
				Statement smt2= con.createStatement();
				ResultSet rs=smt2.executeQuery(sql2);
				while(rs.next())
				{
					int SRollno=rs.getInt(1);								//	System.out.println(rs.getInt(1));
					String SName=rs.getString(2);							//	System.out.println(rs.getString(2));
					String SAddress=rs.getString(3); 						//	System.out.println(rs.getString(3));
					Long SMob=rs.getLong(4); 								//	System.out.println("Rollno");
																			//	System.out.println("Name");
				System.out.println(+SRollno+"	"+SName+"	"+SAddress+"	"+SMob);//	System.out.println("Address");
																			
				}
				break;
			case 4:
				//DELETE Table
				String sql3="DELETE FROM student10 WHERE (SRollno=55)";
				Statement smt3= con.createStatement();
				smt3.execute(sql3);
				System.out.println("Table DELETED Sucessfully");
				break;
				
				
		}System.out.println("-----Thank You------");
			
			con.close();
	}
}
				
				
				
	
		
		
		
		
		
		
		

