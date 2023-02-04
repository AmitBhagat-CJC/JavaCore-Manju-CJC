package CollectionFramework_Revision_List;

import java.util.ArrayList;
import java.util.Iterator;

//Q:7) instanceoff with ArrayList al=new ArrayList();
public class Q7 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		
		
		al.add(55);
		al.add(110);
		al.add(202);
		al.add(804);
		al.add("Hrutik");
		al.add("Sujan");
		al.add("Atul");
		al.add("Ganesh");
		
		
		Iterator itr=al.iterator();
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
		}

	}

}
