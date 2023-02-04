package ab.collection.one;

import java.util.*;
public class ListExample1 
{
	public static void main(String[] args) 
	{
	/*	ArrayList <String> names=new ArrayList<String>();
		
		
		names.add("amit");
		names.add("rahul");
		names.add("ajeet");
		names.add("jyoti");
		
		System.out.println(names);
		System.out.println(names.get(1));
		System.out.println(names.set(2, "ram"));
		System.out.println(names.remove(2));
		System.out.println("SIZE= "+names.size());
		System.out.println(names.contains("Durgesh"));
/*	
/*		List names=new ArrayList();
		
		names.add("amit");
		names.add(101);
		names.add(14.123);
		names.add(true);
		names.add("amit");
		
		System.out.println(names);
*/		
		
/*		
 		LinkedList<String> fruit =new LinkedList<>();
		
		fruit.add("orange");
		fruit.add("pomo");
		fruit.add("apple");
		fruit.add("mango");
		fruit.add("banana");
		
		System.out.println(fruit);
		
		for (String str:fruit)
		{
			System.out.println(str+ "/t" + str.length());
			
			StringBuffer sb=new StringBuffer();
			System.out.println(sb.reverse());
		}
*/		
		LinkedList<Integer> no =new LinkedList<>();
		
		no.add(101);
		no.add(102);
		no.add(103);
		no.add(104);
		no.add(105);
		
		System.out.println(no);
		
		for (Integer i:no)
		{
			System.out.println(i+ "/t" + i.byteValue());
			
		}
	}

}
