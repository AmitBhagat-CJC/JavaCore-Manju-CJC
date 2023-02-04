package HashMap_2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test 
{

	public static void main(String[] args) 
	{
		Student s1=new Student();
		s1.setRollno(1);
		s1.setName("Rohit");
		
		Student s2=new Student();
		s2.setRollno(2);
		s2.setName("Amit");
		
		Map<String,Student>m=new HashMap<>();
		m.put("python", s1);
		m.put("java", s2);
		
		Set<String>keys=m.keySet();
		
		for(String key:keys)
		{
			System.out.println(key);
			Student stu=m.get(key);
			System.out.println(stu.getRollno());
			System.out.println(stu.getName());
			
		}
	}

}
