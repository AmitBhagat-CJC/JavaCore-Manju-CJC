package ab.core.collection.one;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q3 
{
	public static void main(String[] args) {
		
		List l=new ArrayList(); 
		l.add("amit");
		l.add("narsi");
		l.add("jivan");
		l.add("supreme");
		l.add(101);
		l.add(102);
		l.add(103);
		l.add(104);
		
		System.out.println(l);
		
		// 1)Iterator
		
		Iterator itr=l.iterator();
		while (itr.hasNext())
		{
			Object o=itr.next();
			if(o instanceof Integer)
			{
				int i= (int) o;
				
				System.out.println(i);
			}
			else if (o instanceof String)
			{
				String s= (String) o;
				System.out.println(s);
			}
				
		}
		
		
	}

}
