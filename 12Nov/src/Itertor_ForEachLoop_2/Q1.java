package Itertor_ForEachLoop_2;
//Q:1)Write the collection program to add double value into the list 
//using generic and retrieve this element by using iterator and for each loop.
//i) with generic and iterator ii) with generic and for each loop
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;

public class Q1
{
	public static void main(String[] args)
	{
		List<Double>l=new ArrayList<>();
		
			l.add(33.3);					// index 0
			l.add(22.39d);					// index 1
			l.add(19.03d);					// index 2
			l.add(97.23);					// index 3
			l.add(78.1);					// index 4
			l.add(16d);						// index 5
		
			//1) to get values by using  Iterator loop
			
			Iterator<Double> itr=l.iterator();
			while(itr.hasNext())
			{
				double a=(double)itr.next();				//-->  index 0 print kiya jo k float hai
				System.out.println(a);
			}
			
//	}
//}
			//2) to get values by using  Genric and Each Loop
//			for ( double x:l)
//			{
//				System.out.println(x);
//			}
		
		}

}
