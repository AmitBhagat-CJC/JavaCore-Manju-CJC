package List_Test_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ListSetInteger {

	public static void main(String[] args) {
		
		Set s=new HashSet();
			s.add(10);
			s.add(20);
			s.add(30);
			
		List list=new ArrayList();
			list.add(s);
						
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			Set val=(Set)itr.next();
			System.out.println(val);
			
			Iterator itr1=val.iterator();
			while(itr1.hasNext())
			{
				int x=(int)itr1.next();
				System.out.println(x);
			}
				
		}
		
		
			
					
		
		
		

	}

}
