package CollectionFramework_Revision_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class P1 {

	public static void main(String[] args) {
		List list=new ArrayList();
		
		list.add(34);
		list.add("abc");
		list.add('m');
		list.add("xyz");
		list.add(45);
		list.add('A');
		
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			Object o=itr.next();
			if(o instanceof Integer)
			{
				int x=(int)o;
				System.out.println(x);
			}
			else if (o instanceof String)
			{
				String s=(String)o;
				System.out.println(s);
			}
			else if (o instanceof Character)
			{
				Character c=(Character)o;
				System.out.println(c);
				
			}
		}
	}
}
