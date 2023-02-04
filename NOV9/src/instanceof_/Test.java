package instanceof_;

//import java.util.ArrayList;

//import java.util.Iterator;
//import java.util.List;

import java.util.*;
public class Test 
{

	public static void main(String[] args) 
	{
		List list=new ArrayList();
		
		list.add("abc");			// index 0
		list.add("pqr");			// index 1
		list.add("xyz");			// index 2
		list.add("aaa");			// index 3
		list.add(5);				// index 4
		list.add(20);				// index 5
		
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
		}
			
	}

}
