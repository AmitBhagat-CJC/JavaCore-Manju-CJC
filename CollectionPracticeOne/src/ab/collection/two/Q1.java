package ab.collection.two;


import java.util.*;
public class Q1 
{
	public static void main(String[] args) {
//		List list =new ArrayList();
		ArrayList list=new ArrayList();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add("Amit");
		list.add(10.20);
		list.add(true);
		
		System.out.println(list);
		
		
		String val =(String) list.get(5);
		System.out.println(val);
		
		int val1= (int) list.get(4);
		System.out.println(val1);
		
		
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			Object o = itr.next();
			
			if(o instanceof Integer)
			{
				int x=(int) o;
				System.out.println(x);
				
			}
			else if (o instanceof String)
			{
				String s= (String) o;
				System.out.println(s);
			}
			
		}
		
		
	}

}
