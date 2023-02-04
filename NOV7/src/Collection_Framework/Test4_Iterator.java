package Collection_Framework;
//import java.util.Iterator;
//import java.util.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Test4_Iterator 
{

	public static void main(String[] args) 
	{
//		List list=new ArrayList();
		
	
//		list.add(6);    		// index 0
//		list.add(20);			// index 1
//		list.add(30);			// index 2
//		list.add(50);			// index 3
		
		ArrayList  al=new ArrayList();
		
		al.add(6);    		// index 0
		al.add(20);			// index 1
		al.add(30);			// index 2
		al.add(50);			// index 3
		
		
		Iterator itr=al.iterator();
		
		while(itr.hasNext())		//-->whlie loop poochega next element hai kya
		{
			int x=(int)itr.next();
			System.out.println(x);
		}
	}
}
