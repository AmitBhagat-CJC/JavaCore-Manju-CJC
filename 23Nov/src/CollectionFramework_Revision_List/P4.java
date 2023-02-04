package CollectionFramework_Revision_List;

//To get values by using Iterator 
	import java.util.*;

	//import java.util.ArrayList;
	//import java.util.List;
	

	public class P4 {
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
			
			// get values by  using Iterator 
			
			
			Iterator itr=list.iterator();
			
			System.out.println(itr.hasNext());   //-->if true -->checked the element present or not
			int x=(int)itr.next(); //-->it gives the element and pointer moves to another pointer location				
			System.out.println(x);
			
			int y=(int)itr.next(); //-->it gives the element and pointer moves to another pointer location				
			System.out.println(y);
			
			int z=(int)itr.next(); //-->it gives the element and pointer moves to another pointer location				
			System.out.println(z);
			
			String p=(String)itr.next();		//--> index 3 print jo k string hai
			System.out.println(p);
			
			String q=(String)itr.next();		//--> index 3 print jo k string hai
			System.out.println(q);
			
			int n=(int)list.get(5);  		//-->  index 5 print kiya jo k int hai
			System.out.println(n);
			
			float l=(float)list.get(6);				//-->  index 6 print kiya jo k float hai
			System.out.println(l);
			
			float m=(float)list.get(7);				//-->  index 7 print kiya jo k float hai
			System.out.println(m);
			
			System.out.println(itr.hasNext()); 
			int h=(int)itr.next();  		//-->  index 5 print kiya jo k int hai
			System.out.println(h);
			
			
		}
	}


