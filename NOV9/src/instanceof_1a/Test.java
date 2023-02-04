package instanceof_1a;

import java.util.*;

public class Test 
{
	public static void main(String[] args) 
	{
		List list= new ArrayList();
		
		Student s1=new Student();
		s1.setRollno(1);
		s1.setName("Prasad");
		s1.setAddr("Narhe");
		
		Student s2=new Student();
		s2.setRollno(2);
		s2.setName("Mrunal");
		s2.setAddr("Warje");
		
		Student s3=new Student();
		s3.setRollno(3);
		s3.setName("Suchit");
		s3.setAddr("Kothrud");
		
		Student s4=new Student();
		s4.setRollno(4);
		s4.setName("Amit");
		s4.setAddr("Narhe");
			
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			Student stu=(Student)itr.next();
			System.out.println(stu.getRollno());
			System.out.println(stu.getName());
			System.out.println(stu.getAddr());
			
		}
	}
	

}
