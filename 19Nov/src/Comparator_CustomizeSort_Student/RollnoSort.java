package Comparator_CustomizeSort_Student;

import java.util.Comparator;

public class RollnoSort implements Comparator<Student>
	{
		@Override
		public int compare (Student stu1,Student stu2)
		{
			return stu1.getRollno()-stu2.getRollno();		
		}

	}
