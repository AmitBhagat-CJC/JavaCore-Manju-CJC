package Hashset_;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Q3
{
	public static void main(String[] args) 
	{
		List list=new ArrayList();
	
		list.add(20);
		list.add(34);
		list.add(26);
		list.add(10);
		list.add(20);
		list.add(45);
		list.add(26);
		list.add(48);
		list.add(10);
		list.add(45);
		list.add(54);
		list.add(89);
		list.add(20);
		
		System.out.println("List of Element: "+list);
			Set s=new TreeSet();
			s.addAll(list);
		System.out.println("Sorted Set of Element:"+s);

	}
	
	
}

