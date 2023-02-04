package Itertor_ForEachLoop_2;

import java.util.*;

//Q3. Write the collection program for Set of List of  String. Set List List
//i) with generic and iterator ii) with generic and for each loop 
public class Q3
{

	public static void main(String[] args) 
	{
		List<String>mh=new ArrayList<>();
			mh.add("Pune");
			mh.add("Mumbai");
		
		List<String>jh=new ArrayList<>();
			mh.add("Ranchi");
			mh.add("Lohardaga");
			
		List<List<String>>india=new ArrayList<>();		
			india.add(mh);
			india.add(jh);

			//i) with generic and iterator 
			Iterator<List<String>> itr=india.iterator();
			while(itr.hasNext())
			{
				List<String> s=itr.next();				//-->  index 0 print kiya jo k float hai
				System.out.println(s);
			}
			
			
			//System.out.println(india);
			
			//ii) with generic and for each loop 
//		for(List<String>list:india)
//		{
//			for(String city:list)
//			{
//				System.out.println(city);
//			}
//		}

		
		

	}

}
