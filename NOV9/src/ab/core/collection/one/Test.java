package ab.core.collection.one;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test 
{
	public static void main(String[] args) {
		
		
		ArrayList l=new ArrayList();
		
		
		Student s=new Student();
		s.setRollno(101);
		s.setName("amit");
		
		l.add(s);
		
		Iterator itr= l.iterator();
		while(itr.hasNext())
		{
			Student stu=(Student) itr.next();
			
			System.out.println(s.getRollno());
			System.out.println(s.getName());
		}
	}

}
