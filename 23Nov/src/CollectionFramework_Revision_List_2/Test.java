package CollectionFramework_Revision_List_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class Test {

	public static void main(String[] args) {
	
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
			List list=(List)itr.next();//--> List typecast because generic nahi hai
			System.out.println(list);
			
			Iterator itr1=list.iterator();
			while(itr1.hasNext())
			{
				String city =(String)itr1.next(); // -->String Typecast because generics nahi hai
				System.out.println(city);
			}
				
		}
	}
}


