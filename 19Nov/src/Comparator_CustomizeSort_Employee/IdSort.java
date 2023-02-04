package Comparator_CustomizeSort_Employee;

import java.util.Comparator;

public class IdSort implements Comparator <Employee>
{
	@Override
	public int compare(Employee emp1, Employee emp2) 
	{
		
		return emp1.getEmid()-emp2.getEmid();
	}
	

}
