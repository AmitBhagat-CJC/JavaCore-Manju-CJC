package Collection_Framework;
// A: Without loop using list.get


//import java.util.ArrayList;
//import java.util.List;
import java.util.*;


public class Q3 
{
	public static void main(String[] args) 
	{
		List list=new ArrayList();
		
		list.add("abc");			// index 0
		list.add("pqr");			// index 1
		list.add("xyz");			// index 2
		list.add("lmn");			// index 3
		
		//System.out.println(list);   // --> list print kiya 
		
		String s=(String)list.get(0);		//--> index 0 print jo k string hai
		System.out.println(s);
		
		String s1=(String)list.get(1);		//--> index 1 print jo k string hai
		System.out.println(s1);
		

		String s2=(String)list.get(2);		//--> index 2 print jo k string hai
		System.out.println(s2);
		
		String s3=(String)list.get(3);		//--> index 3 print jo k string hai
		System.out.println(s3);

	}
}
