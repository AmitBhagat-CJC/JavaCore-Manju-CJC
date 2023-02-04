package CollectionFramework_Revision_List;
//Q:4) List with Iterator
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q4 {

	public static void main(String[] args) {
		List list=new ArrayList();
		
		list.add("Poornima");
		list.add("Bhagya");
			
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			String val=(String)itr.next();
			System.out.println(val);
		}

	}

}
