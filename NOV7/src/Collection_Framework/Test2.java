package Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Test2 
{
	public static void main(String[] args) 
	{
		List list=new ArrayList();
//		ArrayList list=new ArrayList();
		
		list.add(6);		// index 0
		list.add(20);		// index 1
		list.add(30);		// index 2
		list.add("abc");	// index 3	
		list.add("pqr");	// index 4
		list.add(5);		// index 5
		
		System.out.println(list);   // --> list print kiya 
		
		int x=(int)list.get(0);  		//-->  index 0 print kiya jo k int hai
		System.out.println(x);
		
		String s=(String)list.get(4);		//--> index 4 print jo k string hai
		System.out.println(s);

	}

}
