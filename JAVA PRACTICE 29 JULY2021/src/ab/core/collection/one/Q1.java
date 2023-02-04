package ab.core.collection.one;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Q1 
{
	public static void main(String[] args) 
	{
		Map<Integer,String>m=new HashMap<>();
		m.put(501, "amit");
		m.put(201, "narsi");
		m.put(301, "jivan");
		m.put(101, "supreme");
		
		System.out.println(m);
		
		Set<Integer>keys=m.keySet();
		for(int key: keys)
		{
			System.out.println(key);
			
			String val=(String)m.get(key);
			System.out.println(val);
		}

		
		
		
	}

	

}
