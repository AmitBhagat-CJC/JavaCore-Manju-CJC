package CollectionFramework_Revision_List;

	// Q: Write the program to add String into the list and 
	//retrieve all elements 1)without using loop 
	//and 2) with using loop of iterator.

	
	//import java.util.List;
	//import java.util.ArrayList;
	//import java.util.Iterator;
	import java.util.*;

	public class P3 
	{
		public static void main(String[] args) 
		{
			List list=new ArrayList();
			
			
			list.add(6);				// index 0
			list.add(20);				// index 1
			list.add(30);				// index 2
			list.add("abc");			// index 3
			list.add("pqr");			// index 4
			list.add(5);				// index 5
			list.add(11f);				// index 6
			list.add(12.34f);			// index 7
			
			// without using loop
			
			
			System.out.println(list);   // --> list print kiya 
			
			int x=(int)list.get(0);  		//-->  index 0 print kiya jo k int hai
			System.out.println(x);
			
			int y=(int)list.get(1);  		//-->  index 1 print kiya jo k int hai
			System.out.println(y);
			
			int z=(int)list.get(2);  		//-->  index 2 print kiya jo k int hai
			System.out.println(z);
			
			String s=(String)list.get(3);		//--> index 3 print jo k string hai
			System.out.println(s);
			
			
			String s1=(String)list.get(4);		//--> index 4 print jo k string hai
			System.out.println(s1);
			
			int p=(int)list.get(5);  		//-->  index 5 print kiya jo k int hai
			System.out.println(p);
			
			float n=(float)list.get(6);				//-->  index 7 print kiya jo k float hai
			System.out.println(n);
			
			float m=(float)list.get(7);				//-->  index 7 print kiya jo k float hai
			System.out.println(m);
			
		}

	}
