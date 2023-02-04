package Comparator_CustomizeSort_Employee;

import java.util.Comparator;

public class SalarySort implements Comparator<Employee>
{

	@Override
	public int compare(Employee emp1, Employee emp2) 
	{
		
		return (int) (emp2.getSalary()-emp1.getSalary());
	}

}
