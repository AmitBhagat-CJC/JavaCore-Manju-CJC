package HashMap_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test 
{
	public static void main(String[] args)
	{
		Employee e1=new Employee();	
		e1.setEid(22);
		e1.setEname("Durgesh");
		e1.setEsalary(2131254d);
		
		Employee e2=new Employee();	
		e2.setEid(23);
		e2.setEname("Narsi");
		e2.setEsalary(54545d);
		
		Map<String,Employee>m=new HashMap<>();
		
		m.put("Exeecutive", e1);
		m.put("Manager", e2);
		
		Set<String>Keys=m.keySet();
		
		for(String key:Keys)
		{
			System.out.println(key);
			
			Employee e=m.get(key);
			System.out.println(e.getEid());
			System.out.println(e.getEname());
			System.out.println(e.getEsalary());
		}
	}

}
