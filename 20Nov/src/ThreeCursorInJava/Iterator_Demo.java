package ThreeCursorInJava;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_Demo 
{

	public static void main(String[] args) 
	{
		ArrayList l=new ArrayList();
		for(int i=0;i<=10;i++)
		{
			l.add(i);
		}
		System.out.println(l);	//[0,1,2,3,-----10]
		
		Iterator itr=l.iterator();
		while(itr.hasNext())
		{
			Integer i=(Integer)itr.next();
			if(i%2==0)
				System.out.println(i);	//[0,2,4,6,---10]
		}
		System.out.println(l);		//[0,1,2,3,-----10]

	}

}
