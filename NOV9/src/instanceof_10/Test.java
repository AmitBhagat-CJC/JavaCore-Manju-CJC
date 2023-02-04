package instanceof_10;

import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Test 
{
	public static void main(String[] args) 
	{
		
		List mh=new ArrayList();
		
		mh.add("Pune");
		mh.add("Mumbai");
		mh.add("Nagpur");
		
		List kt=new ArrayList();
		
		kt.add("Tumkur");
		kt.add("Mysuru");
		kt.add("Bluru");
		
		List india=new ArrayList();
		india.add(mh);
		india.add(kt);
		
		Iterator itr=india.iterator();
		while(itr.hasNext())
		{
			List list=(List)itr.next();
			
			Iterator itr1=list.iterator();
			while(itr1.hasNext())
			{
				String city =(String)itr1.next();
				System.out.println(city);
			}
				
				
		}
		
				
		
	}

}




//Object o=itr.next();
//
//if(o instanceof Integer)
//{
//	int x=(int)o;
//	System.out.println(x);
//}
//else if (o instanceof String)
//{
//	String s =(String)o;
//	System.out.println(s);
//}/*