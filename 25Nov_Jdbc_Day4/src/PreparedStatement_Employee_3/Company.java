package PreparedStatement_Employee_3;
import java.util.*;
import java.util.List;

public class Company 
{
	public List<Employee> m1()
	{    		
		//set all employee data (use minimum 2 employee) here.
		
		List<Employee>list=new ArrayList<Employee>();
		
		Employee e1=new Employee();
		e1.setEId(405);
		e1.setEName("Rajan");
		e1.setESalary(52000);
		e1.setEMob(23563);
		
		Employee e2=new Employee();
		e2.setEId(550);
		e2.setEName("Swastik");
		e2.setESalary(52478);
		e2.setEMob(12582);
		
		list.add(e1);
		list.add(e2);
		
		return list;
			
	}

}
