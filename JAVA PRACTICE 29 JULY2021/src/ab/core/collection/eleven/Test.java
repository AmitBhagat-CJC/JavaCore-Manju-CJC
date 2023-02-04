package ab.core.collection.eleven;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Test 
{
	public static void main(String[] args) 
	{
		List l=new ArrayList();
		
		
		Student s=new Student();
		s.setRollno(1);
		s.setName("amit");
		s.setAddress("pune");
		
		l.add(s);
		
		
		Iterator itr=l.iterator();
		while(itr.hasNext())
		{
			Student stu=(Student)itr.next();
			System.out.println(stu.getRollno());
			System.out.println(stu.getName());
			System.out.println(stu.getAddress());
		}
	
			
	}

}
