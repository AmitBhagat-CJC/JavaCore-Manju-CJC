package Collection_Framework;

//import java.util.ArrayList;
//import java.util.List;

import java.util.*;
public class Q14 
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
		
		System.out.println(list);
		
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			char c=(char) itr.next();
			System.out.println(c);
		}

				
	}

}
