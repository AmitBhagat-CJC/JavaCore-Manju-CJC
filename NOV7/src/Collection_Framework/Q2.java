package Collection_Framework;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;

//WAP to add 11f, 12.34f, 13.34f, 14.11f, 15.8f, 16f 
//all this element into the list 
//and retrieve this element by using iterator.

public class Q2 
{
	public static void main(String[] args) 
	{
		List list=new ArrayList();
		
		list.add(11f);					// index 0
		list.add(12.34f);				// index 1
		list.add(13.34f);				// index 2
		list.add(14.11f);				// index 3
		list.add(15.8f);				// index 4
		list.add(16f);					// index 5
		
		//to get values by using  loop
		
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			float a=(float)itr.next();				//-->  index 0 print kiya jo k float hai
			System.out.println(a);
			
			
		}
	}
}

