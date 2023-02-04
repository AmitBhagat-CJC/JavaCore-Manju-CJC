package instanceof_6;

//2. Write the collection program to add 73.30f, 256.39d, 11, 77L, 79.10, 87D, 58l 
//all this element into the list and retrieve this element by using iterator.

//import java.util.ArrayList;
//import java.util.List;
import java.util.*;

public class Test 
{

	public static void main(String[] args) 
	{
		List list=new ArrayList();
		
		list.add(73.30f);				// index 0
		list.add(256.39d);				// index 1
		list.add(11);					// index 2
		list.add(77L);					// index 3
		list.add(79.10d);				// index 4
		list.add(87D);					// index 5
		list.add(58l);					// index 6
		
		
		Iterator  itr=list.iterator();
		while(itr.hasNext())
		{
			Object o=itr.next();
			
			if(o instanceof Integer)
			{
				int x=(int)o;
				System.out.println(x);
			}
			else if (o instanceof Float)
			{
				Float f=(Float)o;
				System.out.println(f);
			}
			else if (o instanceof Double)
			{
				Double d=(Double)o;
				System.out.println(d);
			}
			else if (o instanceof Long)
			{
				Long l=(Long)o;
				System.out.println(l);
			}
	 	}
	}
}
