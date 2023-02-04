package CollectionFramework_Revision_List;
//Q:2)ArrayList al=new ArrayList();
import java.util.ArrayList;
import java.util.List;

public class Q2 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(5);
		al.add(10);
		al.add(20);
		al.add("karthik");
		al.add("Anushka");
		
		int x=(int)al.get(0);
		int y=(int)al.get(2);
		int z=(int)al.get(1);
		
		String a=(String)al.get(3);
		String b=(String)al.get(4);
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		System.out.println(a);
		System.out.println(b);

	}

	

}
