package Comparator_CustomizeSort_Employee;

import java.util.Comparator;

public class NameSort implements Comparator <Employee>
{
		@Override
		public int compare (Employee emp1,Employee emp2)
		{
			return emp1.getEmname().compareTo(emp2.getEmname());
		}
}

