package Hashset_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class Q9 
{

	public static void main(String[] args) 
	{	
		List list=new ArrayList();
		
		list.add(11f);
		list.add(12.34f);
		list.add(13.34f);
		list.add(14.11f);
		list.add(15.8f);
		list.add(16f);
		
			
		System.out.println("List of Element : "+list);
		Iterator  itr=list.iterator();
		while(itr.hasNext())//--> true
		{
		Float f=(Float)itr.next();
		System.out.println(f);
		}
//		Iterator  itr1=s.iterator();
//		while(itr1.hasNext())
//		{
//			String s1=(String)itr1.next();
//			System.out.println(s1);
//		
//		}
	}
	
}
		
		
		
