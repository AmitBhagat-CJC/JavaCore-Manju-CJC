package PreparedStatement_Student_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//S6:SELECT /Retrieve data from first database and 
//INSERT /add into second database using prepared statement.(in one class) 
public class S6 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
				//Step1:Load driver class
				Class.forName("com.mysql.jdbc.Driver");
						
				//Step2:Established Connectivity or Connection
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
				
				//Step3:Construct sql Query
				String sql="SELECT * FROM student1"; 
				
				//Step4:create statement object
				PreparedStatement ps= con.prepareStatement(sql);
				
				//Step5:Submit sql Query
				ResultSet rs=ps.executeQuery();
				while(rs.next())
				{
					//Step3-again:Construct SQL Query
					String sql1=" insert into student3 values (?,?,?,?,?)";
					PreparedStatement ps1= con.prepareStatement(sql1);
					ps1.setInt(1,rs.getInt(1));
					ps1.setString(2, rs.getString(2));
					ps1.setString(3, rs.getString(3));
					ps1.setLong(4, rs.getLong(4));
					ps1.setInt(5, rs.getInt(5));
					ps1.execute();
					
				}
				System.out.println("Data Inserted Sucessfully");
				ps.close();
				con.close();
		}

}
