package Collection_Framework;

import java.util.*;

public class Test1 
{

	public static void main(String[] args) 
	{
		List list=new ArrayList();
		//ArrayList=new ArrayList();
		
		list.add(6);
		list.add(20);
		list.add(30);
		list.add("abc");
		list.add("pqr");
		list.add(5);
		
		System.out.println(list);
		
		int x=(int)list.get(0);   // --> index zero print kiya jo ki int hai
		System.out.println(x);
		
		String s=(String)list.get(4);
		System.out.println(s);

	}

}
