package PreparedStatement_Student_4;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RetriveData 
	{    	List<Stude>
		public List m1() throws SQLException, ClassNotFoundException 
		{   		
		//Retrieve data from first database and set into student here using prepared statement.   
			//Step1:Load driver class
			Class.forName("com.mysql.jdbc.Driver");
					
			//Step2:Established Connectivity or Connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
			
			//Step3:Construct sql Query
			String sql="SELECT * FROM student1"; 
			
			//Step4:create statement object
			
			PreparedStatement ps= con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				ps.setInt(1,rs.getInt(1));
				ps.setString(2, rs.getString(2));
				ps.setString(3, rs.getString(3));
				ps.setLong(4, rs.getLong(4));
				ps.setInt(5, rs.getInt(5));
				ps.execute();
				
				List
				
			}
			
		}
		
	}


