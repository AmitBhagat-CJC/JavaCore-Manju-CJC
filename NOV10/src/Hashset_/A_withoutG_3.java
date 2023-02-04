package Hashset_;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class A_withoutG_3 
{

	public static void main(String[] args)
	{
		// to sort element of list 
		//and remove duplicate element from list
		
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
		
		Set s=new TreeSet();// (list);
		s.addAll(list);
		System.out.println("Maintained order set of element:"+s);
	}

}
