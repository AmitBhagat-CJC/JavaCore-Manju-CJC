package Comparable_NaturalSort_Student;

import java.util.Set;
import java.util.TreeSet;

public class Test 
{

	public static void main(String[] args) 
	{
		Student s1=new Student();
		s1.setRollno(2);
		s1.setName("jeevan");
		
		Student s2=new Student();
		s2.setRollno(1);
		s2.setName("supreme");
		
		Student s3=new Student();
		s3.setRollno(3);
		s3.setName("narsi");
		
		Set<Student>s=new TreeSet<>();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		
		for  (Student stu:s)
		{
			System.out.println(stu.getRollno());
			System.out.println(stu.getName());
		}
	}

}
