package With_Genric;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.*;


public class A 
{
	public static void main(String[] args) 
	{
//		List<String>l=new ArrayList<>();
		List<Integer>l=new ArrayList<>();
		
		l.add(5);
		l.add(20);
		l.add(30);
//		l.add("a");
//		l.add(50);
		
		System.out.println(l);
		
//		String s=(String)l.get(3);
//		System.out.println(s);
		
		
		int x=l.get(0);
		System.out.println(x);
	}
}

/*System.out.println(list);   // --> list print kiya 

int x=(int)list.get(0);  		//-->  index 0 print kiya jo k int hai
System.out.println(x);

int y=(int)list.get(1);  		//-->  index 1 print kiya jo k int hai
System.out.println(y);

int z=(int)list.get(2);  		//-->  index 2 print kiya jo k int hai
System.out.println(z);

String s=(String)list.get(3);		//--> index 3 print jo k string hai
System.out.println(s);


String s1=(String)list.get(4);		//--> index 4 print jo k string hai
System.out.println(s1);

int p=(int)list.get(5);  		//-->  index 5 print kiya jo k int hai
System.out.println(p);

float n=(float)list.get(6);				//-->  index 7 print kiya jo k float hai
System.out.println(n);

float m=(float)list.get(7);				//-->  index 7 print kiya jo k float hai
System.out.println(m);
*/
