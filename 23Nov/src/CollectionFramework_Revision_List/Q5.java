package CollectionFramework_Revision_List;
//Q:5) ArrayList with Iterator
import java.util.ArrayList;
import java.util.Iterator;

public class Q5 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("Poornima");
		al.add("Bhagya");
		
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			String val=(String)itr.next();
			System.out.println(val);
		}

	}

}
