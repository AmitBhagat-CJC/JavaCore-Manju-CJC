package instanceof_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import instanceof_1.Student;

public class Test_India 
{

	public static void main(String[] args) 
	{
		List mh=new ArrayList();
		mh.add("Pune");
		mh.add("Mumbai");
		mh.add("Nagpur");
		
		List jh=new ArrayList();
		jh.add("Ranchi");
		jh.add("Lakhada");
		jh.add("Peru");
		
		List india=new ArrayList();
		india.add(mh);
		india.add(jh);
		
				
		Iterator itr=india.iterator();
		while(itr.hasNext())
		{
			List val=(List) itr.next();
			
			System.out.println(val);
		}
	}

}
