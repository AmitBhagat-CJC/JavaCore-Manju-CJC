package JDBC_Day_3_c;

import java.util.ArrayList;

import java.util.List;

public class College 
{
	public List<Student>allStudentData()
	{
		List<Student>list=new ArrayList<Student>();
		
		Student s1=new Student();
		s1.setRollno(8);
		s1.setName("Saroj");
		s1.setAddress("Warje");
		
		Student s2=new Student();
		s2.setRollno(7);
		s2.setName("Varun");
		s2.setAddress("Katraj");
		
		list.add(s1);
		list.add(s2);
		
		return list;
	}

}
