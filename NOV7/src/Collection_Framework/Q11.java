package Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q11 
{
	public static void main(String[] args) 
	{
		List list=new ArrayList();
		
		list.add('a');					// index 0
		list.add('b');					// index 1
		list.add('A');					// index 2
		list.add('c');					// index 3
		list.add('d');					// index 4
		list.add('E');					// index 5
		
		//to get values by using  loop
		
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			char a=(char)itr.next();				//-->  index 0 print kiya jo k float hai
			System.out.println(a);
			
			
		}
	}

}
