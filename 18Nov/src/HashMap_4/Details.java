package HashMap_4;


// 2 class communication karna hai aur badme isko hi scanner lagana hai
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Details 
{
			
		public void getDetails(Student s1)	
		{
			Map<String,Student>m=new HashMap<>();
			m.put("student", s1);
			
			Set<String>keys=m.keySet();
			for(String key:keys)
			{
				System.out.println(key);
				Student stu=m.get(key);
				System.out.println(stu.getRollno());
				System.out.println(stu.getName());
			}
		}
		public Student setDetails()
		{
			Student s1=new Student();
			s1.setRollno(1);
			s1.setName("Arvind");
			
			return s1;
		}
	
}
