package Hashset_;
import java.util.*;

import java .util.ArrayList;
public class A_withoutG_1 
{

	public static void main(String[] args) 
	{
			// To remove duplicate element from list
		
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
		
		Set s=new HashSet();// (list);
		s.addAll(list);
		System.out.println("set of element:"+s);
	}
	

}


