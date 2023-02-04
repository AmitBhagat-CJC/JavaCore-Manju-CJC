package List_Test_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class M2 {

	public static void main(String[] args) {
		
		Map m=new HashMap();
		m.put(50, "gagan");
		m.put(20, "Rehan");
		m.put(10, "Ansh");
		
		Set keys=m.keySet();
		for(int key:keys)
		{
			System.out.println(key);
			String val=(String)m.get(key);
			System.out.println(val);
		}
		

	}

}
