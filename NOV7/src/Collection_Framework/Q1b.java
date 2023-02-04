package Collection_Framework;
// using loop of iterator

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q1b 
{

	public static void main(String[] args) 
	{
		List list=new ArrayList();
		
		
		list.add(6);				// index 0
		list.add(20);				// index 1
		list.add(30);				// index 2
//		list.add("Suresh");			// index 3
//		list.add("Ramesh");			// index 4
		list.add(5);				// index 5
//		list.add(11f);			// index 6
//		list.add(12.34f);			// index 7
		
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			int x=(int)itr.next();
			System.out.println(x);
							
//			String val=(String)itr.next();
//			System.out.println(val);
		
		}
		

	}

}
