package CollectionFramework_Revision_List;
// Q1:List list=new ArrayList();
import java.util.ArrayList;
import java.util.List;

public class Q1 {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(5);			//index 0
		list.add(10);			//index 1
		list.add(20);			//index 2
		list.add("karthik");	//index 3
		list.add("Anushka");	//index 4
		
		int x=(int)list.get(0);
		int y=(int)list.get(2);
		int z=(int)list.get(1);
		
		String a=(String)list.get(3);
		String b=(String)list.get(4);
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		System.out.println(a);
		System.out.println(b);

	}

}
