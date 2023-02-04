package Hashset_;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class A_withoutG_4 
{ 	 	
	
	
	public static void main(String[] args) 
	{
		List list=new ArrayList();
		
		list.add(11);
		list.add(12);
		list.add(11);
		list.add(13);
		list.add(14);
		list.add(12);
		list.add(15);
		list.add(13);
		list.add(17);
		list.add(11);
		
		System.out.println("List of Element : "+list);
		
		Collections.sort(list);// (list);
		System.out.println("Sorted set of Element using sort:"+list);
	}


}


