package Comparator_CustomizeSort_Employee;
//Q:8) set add employee data and add it into the set using switch case.
// And also get data by using iterator. 

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test 
{

	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		e1.setEmid(11);
		e1.setEmname("Amar");
		e1.setSalary(10000);
		
		Employee e2=new Employee();
		e2.setEmid(22);
		e2.setEmname("Tom");
		e2.setSalary(5000);
		
		Employee e3=new Employee();
		e3.setEmid(33);
		e3.setEmname("Harry");
		e3.setSalary(15000);
		
		Set<Employee>s=null;
		
		System.out.println("----select----\n" +"1.IdSort \n" +"2.NameSort \n" +"3.SalarySort \n");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Choice");
		
		int ch=sc.nextInt();
		
		
		switch(ch)
		{
			case 1:
			
			s=new TreeSet<>(new IdSort());
			break;
			
			case 2:
			s=new TreeSet<>(new NameSort());
			
			case 3:
			s=new TreeSet<>(new SalarySort());
		}
		
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
