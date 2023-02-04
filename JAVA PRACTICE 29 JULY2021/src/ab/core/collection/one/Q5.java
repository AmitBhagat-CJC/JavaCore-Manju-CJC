package ab.core.collection.one;

import java.util.ArrayList;
import java.util.List;

public class Q5
{
	public static void main(String[] args) {
		
		List<String>l=new ArrayList<>();
		
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");
		l.add("E");
		l.add("B");
		
		System.out.println("List" +l);
		
		l.remove("B");
		
		System.out.println("After Removing Element"+l);
		
	}

}
