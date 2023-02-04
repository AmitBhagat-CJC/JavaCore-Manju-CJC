package instanceof_5;
//1. Write the collection program to add 34, "abc", 'm', "xyx",45, 'A' 
//all this element into the list and retrieve this element by using iterator. 

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;

public class Test 
{

	public static void main(String[] args) 
	{
		List list=new ArrayList();
		
		list.add(34);				// index 0
		list.add("abc");			// index 1
		list.add('m');				// index 2
		list.add("xyz");			// index 3
		list.add(45);				// index 4
		list.add('A');				// index 5
		
		Iterator  itr=list.iterator();
		while(itr.hasNext())
		{
			Object o=itr.next();
			
			if(o instanceof Integer)
			{
				int x=(int)o;
				System.out.println(x);
			}
			else if (o instanceof String)
			{
				String s =(String)o;
				System.out.println(s);
			}
			else if (o instanceof Character)
			{
				Character c=(Character)o;
				System.out.println(c);
			}
		}
			
	}
		
}


