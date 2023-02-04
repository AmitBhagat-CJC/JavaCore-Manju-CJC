package CollectionFramework_Revision_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Q:6) instanceoff with List list=new ArrayList();
public class Q6 {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(55);
		list.add(110);
		list.add(202);
		list.add(804);
		list.add("Hrutik");
		list.add("Sujan");
		list.add("Atul");
		list.add("Ganesh");
		
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			Object o=itr.next();	//--> object me ya to int reahega nahi to string rahega 
			if(o instanceof Integer)
			{
				int x=(int)o;
				System.out.println(x);
			}
			else if(o instanceof String)
			{
				String s=(String)o;
				System.out.println(s);
			}
		}
	}

}
