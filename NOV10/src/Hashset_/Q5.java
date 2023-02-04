package Hashset_;
//Q5. What will be the output? 	

import java.util.ArrayList;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Q5 
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
		
		Set s=new TreeSet();
		s.addAll(list);
		System.out.println(s);

	}

}
