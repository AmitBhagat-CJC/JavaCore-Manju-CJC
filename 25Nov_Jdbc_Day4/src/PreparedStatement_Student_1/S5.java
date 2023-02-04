package PreparedStatement_Student_1;
// S5:SELECT/RETRIEVE DATA FROM STUDENT TABLE
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class S5 
{
	public static void main(String[] args) throws ClassNotFoundException,SQLException {

		//Step1:Load driver class
		Class.forName("com.mysql.jdbc.Driver");
				
		//Step2:Established Connectivity or Connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		
		//Step3:Construct sql Query
		String sql="SELECT * FROM student6"; 
		
		//Step4:create statement object
		PreparedStatement ps= con.prepareStatement(sql);
		
		//Step5:Submit sql Query
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			
//			System.out.println("Rollno");
//			System.out.println("Name");
//			System.out.println("Address");
		}
		
		//Step6:Close connection and Statement Object
				ps.close();
				con.close();
		
	}

}
