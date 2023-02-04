package Hashset_;

import java.util.Iterator;
import java.util.Set;
import java.util.*;

public class A_withoutG 
{

	public static void main(String[] args) 
	{
		// Duplicates are not allowed
		//insertion order or index not maintained
		
		Set s=new HashSet();
		s.add(10);
		s.add(5);
		s.add(15);
		//s.add(5);		// duplicates are not allowed
		
		Iterator itr=s.iterator();
		while (itr.hasNext())
		{
			int x=(int)itr.next();
			System.out.println(x);
		}
		
	}

}
