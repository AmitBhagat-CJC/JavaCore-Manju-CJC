package Map_0;
import java.util.*;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Map;
//import java.util.Set;

public class Map2 
{

	public static void main(String[] args) 
	{
		Map m=new HashMap();
		
		m.put(5,"Amit");
		m.put(10,"Rahul");
		m.put(20,"Durgesh");
		
		System.out.println(m);
		
		Set<Integer>keys=m.keySet();
		
		Iterator<Integer>itr=keys.iterator();
		while(itr.hasNext())
		{
			int key=(int)itr.next();
			System.out.println(key);
			
			String val=(String)m.get(key);
			System.out.println(val);
		}
	

	}

}
