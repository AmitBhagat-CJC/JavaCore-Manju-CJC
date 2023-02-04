package instanceof_9;

import java.util.Iterator;
import java.util.List;

public class Test 
{
	public static void main(String[] args) 
	{
			Details d=new Details(); 
			Object list = d.setDetails(); 
	
	
			Iterator  itr=((List)list).iterator();
			while(itr.hasNext())
			{
				Employee emp=(Employee)itr.next();
				
				System.out.println(emp.getEmpid());
				System.out.println(emp.getEmpname());
				System.out.println(emp.getEmpdesig());
				System.out.println(emp.getEmpsalary());
			}

		}

} 


