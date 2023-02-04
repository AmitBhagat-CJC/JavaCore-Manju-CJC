package Collection_Framework;
//import java.util.List;

//import java.util.ArrayList;
//import java.util.Iterator;
import java.util.*;

public class Q4 
{
	public static void main(String[] args) 
	{
		List list=new ArrayList();
		
		
		list.add("abc");			// index 0
		list.add("pqr");			// index 1
		list.add("xyz");			// index 2
		list.add("lmn");			// index 3
		
		//System.out.println(list);   // --> list print kiya 
		
		Iterator itr=list.iterator();
		//System.out.println(itr.hasNext());
		String p=(String)itr.next();		//--> index 0 print jo k string hai
		System.out.println(p);
		
		String q=(String)itr.next();		//--> index 1 print jo k string hai
		System.out.println(q);
		
		String r=(String)itr.next();		//--> index 2 print jo k string hai
		System.out.println(r);
		
		String s=(String)itr.next();		//--> index 3 print jo k string hai
		System.out.println(s);
		
		
		while(itr.hasNext()) 
		{
			//int x=(int)itr.next();
			//System.out.println(x);
			
			
				
			String val=(String)itr.next();
			System.out.println(val);
		
		}
		
	}
		
	}


