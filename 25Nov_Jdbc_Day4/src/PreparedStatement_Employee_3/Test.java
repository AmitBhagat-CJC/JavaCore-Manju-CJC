package PreparedStatement_Employee_3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;


public class Test 
{
	public static void main(String[] args) throws Exception
	{       		
		//The data which are set in m1() add it into database here using prepared statement.     	
		
		Company com=new Company();
		Connection con=MyConnection.getConnection();
		
		List<Employee>list=com.m1();
		for(Employee emp:list)
		{
			int EId=emp.getEId();
			String EName=emp.getEName();
			Double ESalary=emp.getESalary();
			Long EMob=emp.getEMob();
			String sql=" insert into employee values (?,?,?,?)";
			PreparedStatement ps= con.prepareStatement(sql);
			
			ps.setInt(1, EId);
			ps.setString(2, EName);
			ps.setDouble(3, ESalary);
			ps.setLong(4, EMob);
			
			ps.execute();
			
			System.out.println("Sucessfully Added/Inserted");
		}
		
	
	}
	
}


