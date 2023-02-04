package instanceof_1;

import java.util.*;
import java.util.ArrayList;

public class Test 
{

	public static void main(String[] args) 
	{
		List list= new ArrayList();
		Student s1=new Student();
		s1.setRollno(1);
		s1.setName("Ratan");
		
		Student s2=new Student();
		s2.setRollno(2);
		s2.setName("Shrikant");
			
		list.add(s1);
		list.add(s2);
		
		
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			Student stu=(Student)itr.next();
			System.out.println(stu.getRollno());
			System.out.println(stu.getName());
			
		}
	}
}
		
		
		
		

