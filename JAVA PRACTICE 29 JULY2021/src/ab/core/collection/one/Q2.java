package ab.core.collection.one;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Q2 
{
	public static void main(String[] args)
	{
		Stack al=new Stack();
		al.add(11);
		al.add(12);
		al.add(13);
		al.add(14);
		al.add(15);
		al.add(16);
		al.add(17);
		al.add(18);
		al.add(19);
		al.add(20);
//		al.add("amit");
//		al.add("narsi");
		
		System.out.println(al);
		
		int x=(int) al.get(9);
		System.out.println(x);
		
//		String y=(String) al.get(11);
//		System.out.println(y);
		
	Iterator itr=al.iterator();
	while(itr.hasNext())
	{
		int val=(int) itr.next();
		System.out.println(val);
		
	
	}
		
		
		
		
	}

}
