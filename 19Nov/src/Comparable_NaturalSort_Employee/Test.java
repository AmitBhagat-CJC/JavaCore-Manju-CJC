package Comparable_NaturalSort_Employee;

import java.util.Set;
import java.util.TreeSet;

public class Test 
{
	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		e1.setEmid(11);
		e1.setEmname("Jeevan");
		e1.setSalary(10000);
		
		Employee e2=new Employee();
		e2.setEmid(22);
		e2.setEmname("Supreme");
		e2.setSalary(5000);
		
		Employee e3=new Employee();
		e3.setEmid(33);
		e3.setEmname("Narsi");
		e3.setSalary(15000);
		
		Set<Employee>s=new TreeSet<>();
		s.add(e1);
		s.add(e2);
		s.add(e3);
		
		for(Employee emp:s)
		{
			System.out.println(emp.getEmid());
			System.out.println(emp.getEmname());
			System.out.println(emp.getSalary());
		}
	

	}

}
