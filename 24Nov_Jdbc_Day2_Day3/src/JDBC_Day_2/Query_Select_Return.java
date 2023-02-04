package JDBC_Day_2;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Query_Select_Return {
	public static void main(String[] args) throws ClassNotFoundException,SQLException {

		
		List<Student>l=new ArrayList<Student>();
		
		//Step1:Load driver class
		Class.forName("com.mysql.jdbc.Driver");
				
		//Step2:Established Connectivity or Connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		
		//Step3:Construct sql Query
		String sql=" select * from  studentdata"; 
		
		//Step4:create statement object
		Statement smt= con.createStatement();
		
		//Step5:Submit sql Query
		ResultSet rs=smt.executeQuery(sql);
		while(rs.next())
		{
			Student stu=new Student();
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			l.add(stu);
		}
					
		//Step6:Close connection and Statement Object
				smt.close();
				con.close();
		
	}

}
