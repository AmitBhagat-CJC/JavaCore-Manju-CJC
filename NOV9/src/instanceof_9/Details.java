package instanceof_9;
import java.util.*;

public class Details 
{
	
	public List setDetails()
	{ 		//get employee data here using iterator. 
		Scanner sc=new Scanner(System.in);
		
		List details=new ArrayList();
		
		//set employee data here and add it into list.
		
		Employee e1=new Employee();
		System.out.println("Enter your emp_id:");
		int empid=sc.nextInt();
		e1.setEmpid(empid);
		
		System.out.println("Enter Your emp_name:");
		String empname=sc.next();
		e1.setEmpname(empname);
		
		System.out.println("Enter your emp_desig");
		String empdesig=sc.next();
		e1.setEmpdesig(empdesig);
		
		System.out.println("Enter yor salary");
		Double empsalary=sc.nextDouble();
		e1.setEmpsalary(empsalary);
		
		Employee e2=new Employee();
		System.out.println("Enter your emp_id:");
		int emid=sc.nextInt();
		e2.setEmpid(empid);
		
		System.out.println("Enter Your emp_name:");
		String emname=sc.next();
		e2.setEmpname(empname);
		
		System.out.println("Enter your emp_desig");
		String emdesig=sc.next();
		e2.setEmpdesig(empdesig);
		
		System.out.println("Enter yor salary");
		Double emsalary=sc.nextDouble();
		e2.setEmpsalary(empsalary);
		
		details.add(e1);
		details.add(e2);
			
		return details;
	}       	
} 
	


