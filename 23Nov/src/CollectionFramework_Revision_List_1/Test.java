package CollectionFramework_Revision_List_1;
// Q:8) list  me 2 object banaye student 1 and student 2 
// phir object s1 aur s2 ko list me add kar diya
// badme Iterator lagakar main Student object banaya aur usme variable Rolllno aur Name ko print karva diya
import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
			List list=new ArrayList();
			
			Student s1=new Student();
			s1.setRollno(1);
			s1.setName("Sunil");
			
			Student s2=new Student();
			s2.setRollno(2);
			s2.setName("Anil");
			
			list.add(s1);
			list.add(s2);
			
			Iterator itr=list.iterator();
			while(itr.hasNext())
			{
				Student stu=(Student)itr.next();
				System.out.println(stu.getRollno());
				System.out.println(stu.getName());
			}
					
	
	}

}
