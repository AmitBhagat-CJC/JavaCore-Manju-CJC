package CollectionFramework_Revision_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Q:3)Iterator With int on list
public class Q3 {

	public static void main(String[] args) {
		List list=new ArrayList();
		
		list.add(35);
		list.add(50);
		list.add(70);
		
		
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			int x=(int)itr.next();
			System.out.println(x);
		}

	}

}
