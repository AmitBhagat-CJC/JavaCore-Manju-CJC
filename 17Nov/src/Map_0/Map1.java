package Map_0;
//Q: By using 1)Generic  2)Map 3)Set  4)For Each loop

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

 
public class Map1 {

	public static void main(String[] args) 
	{
		
		Map m=new HashMap();
		m.put(5,"Amit");
		m.put(10,"Rahul");
		m.put(20,"Durgesh");
		
		System.out.println(m);
		
		Set<Integer>keys=m.keySet();
		
		for(int key:keys)
		{
			System.out.println(key);
			
			String val=(String)m.get(key);
			System.out.println(val);
		
		}
		
		
	}

}
