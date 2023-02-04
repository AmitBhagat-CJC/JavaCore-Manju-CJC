package Without_Genric;
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
		List l=new ArrayList();
		
		l.add(5);
		l.add(20);
		l.add(30);
		l.add("abc");
		l.add(50);
		
		//int x=(int)l.get(3);  //Runtime ClassCastException
		
		//String s=(String)l.get(0); //Runtime ClassCastException
		
		int x=(int)l.get(0);
		System.out.println(x);
	}
	
}







