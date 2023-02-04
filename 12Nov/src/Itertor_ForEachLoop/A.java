package Itertor_ForEachLoop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class A 
{

	public static void main(String[] args) 
	{
		List<Integer>l=new ArrayList<>();
		
		l.add(5);
		l.add(20);
		l.add(30);
		l.add(5);
		
		System.out.println(l);
		
		for (int x:l)
		{
			System.out.println(x);
		}
		
	}

}


//Iterator<Integer>itr=l.iterator();
//while(itr.hasNext())
//{
//	int x=itr.next();
//	System.out.println(x);
//}
//	}
//}

















