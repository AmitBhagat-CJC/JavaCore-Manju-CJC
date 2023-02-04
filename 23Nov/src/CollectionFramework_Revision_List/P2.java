package CollectionFramework_Revision_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class P2 {

	public static void main(String[] args) {
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
