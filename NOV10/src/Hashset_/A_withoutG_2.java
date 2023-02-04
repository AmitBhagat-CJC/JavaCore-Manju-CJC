package Hashset_;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class A_withoutG_2 
{

	public static void main(String[] args) 
	{
		// To remove duplicate element from list 
		// and maintained insertion order
		
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
				
				Set s=new LinkedHashSet();// (list);
				s.addAll(list);
				System.out.println("Maintained order set of element:"+s);
		}
			

}


