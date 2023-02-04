package HashMap_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo_1 
{

	public static void main(String[] args) 
	{
		Map<String,String>m=new HashMap<>();
		
		m.put("aaa", "abc");
		m.put("bbb","xyz");
		m.put("ccc","pqr");
		
		Set<String>keys=m.keySet();
		for(String key:keys)
		{
			System.out.println(key);
			String val=(String)m.get(key);
			System.out.println(val);
			
		}
		
	}

}
