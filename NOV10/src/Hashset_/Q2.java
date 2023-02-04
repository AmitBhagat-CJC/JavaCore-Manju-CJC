package Hashset_;
//Q2. Write the collection program to remove duplicate element from list 
//and retrive element indexwise. 	
//[20.20, 34.1, 26.23, 10, 20.20, 45, 26.23, 48, 10, 45, 54, 89, 20] 

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Q2 
{

	public static void main(String[] args) 
	{	
		List list=new ArrayList();
		
		list.add(20.20f);
		list.add(34.1f);
		list.add(26.23f);
		list.add(10);
		list.add(20.20f);
		list.add(45);
		list.add(26.23f);
		list.add(48);
		list.add(10);
		list.add(45);
		list.add(54);
		list.add(89);
		list.add(20);
		
		System.out.println("List of Element : "+list);
		
		Set s=new LinkedHashSet();// (list);
		s.addAll(list);
		System.out.println("Maintained order set of element:"+s);
	}



}


