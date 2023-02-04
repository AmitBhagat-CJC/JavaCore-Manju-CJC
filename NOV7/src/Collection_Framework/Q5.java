package Collection_Framework;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;

public class Q5 
{
	public static void main(String[] args) 
	{
		List list=new ArrayList();
		
		list.add(33.3);					// index 0
		list.add(22.39d);				// index 1
		list.add(19.03d);				// index 2
		list.add(97.23);				// index 3
		list.add(78.1);					// index 4
		list.add(16d);					// index 5
		
		//to get values by using  loop
		
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			double d=(double)itr.next();				//-->  index 0 print kiya jo k float hai
			System.out.println(d);
			
			
		}
	}
}
