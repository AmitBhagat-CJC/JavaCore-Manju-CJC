package Itertor_ForEachLoop_2;
import java.util.*;

//Q2. Write the collection program for Set of List of  String. (Set Set Set)
//i) with generic and iterator ii) with generic and for each loop 


public class Q2 
{
	public static void main(String[] args) 
	{
		Set<String>mh=new HashSet<>();
			mh.add("Pune");
			mh.add("Mumbai");
		
		Set<String>jh=new HashSet<>();
			jh.add("Ranchi");
			jh.add("Lohardaga");
		
		Set<Set<String>>india=new HashSet<>();
			india.add(mh);
			india.add(jh);
		
		System.out.println(india);
		
			Iterator<Set<String>>itr=india.iterator();
			while(itr.hasNext())//--> true
			{
				Set india1=(Set)itr.next();
				System.out.println(india1);
			
//				Set<String> s2 = null;
//				Iterator  itr1=s2.iterator();
//			while(itr1.hasNext())
//			{
//				String s1=(String)itr1.next();
//				System.out.println(s1);
//			}
		}
	}
}

/*import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;*/

