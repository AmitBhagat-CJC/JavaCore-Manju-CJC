package PreparedStatement_Employee_2;
//Q4. Write the jdbc program to get/retrieve/select employee data from database using prepared statement.

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.PseudoColumnUsage;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test 
{
	List<Employee>listemp=new ArrayList<Employee>();
	//Step1:Load Driver Class 
	Class.forName("com.mysql.jdbc.Driver");
			
	//Step2:Established Connection
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
	
	//Step3:Construct SQL Query
	String sql="SELECT * FROM employee";  
	
	//Step4:create statement object
	
	PreparedStatement ps= con.prepareStatement(sql);
	ps.
	ps.setString(2, EName);
	ps.setDouble(3, ESalary);
	ps.setLong(4, EMob);
	listemp.add(emp);
	
	//Step5:Submit SQL Query
	ps.execute();
	
	System.out.println("Sucessfully Added/Inserted");
	

		
		
	}
	System.out.println(listemp);
	
	
			
	//Step6:Close Connection and Statement Object
			smt.close();
			con.close();
	
}
}



	
	
	