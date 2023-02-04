package Hashset_;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.*;

public class Q7 
{

	public static void main(String[] args) 
	{
		Set mh=new HashSet();
		mh.add("Pune");
		mh.add("Mumbai");
		
		Set jh=new HashSet();
		mh.add("Ranchi");
		mh.add("Lohardaga");
		
		Set india=new HashSet();
		india.add(mh);
		india.add(jh);
		
		System.out.println(india);
		
			Iterator  itr=india.iterator();
			while(itr.hasNext())//--> true
			{
			Set s=(Set)itr.next();
			System.out.println(s);
			Iterator  itr1=s.iterator();
			while(itr1.hasNext())
			{
				String s1=(String)itr1.next();
				System.out.println(s1);
			
			}
		
		}

	}
}
