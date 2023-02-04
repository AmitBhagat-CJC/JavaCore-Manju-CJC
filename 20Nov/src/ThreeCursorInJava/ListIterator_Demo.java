package ThreeCursorInJava;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIterator_Demo 
{

	public static void main(String[] args) 
	{
		LinkedList l=new LinkedList();
		l.add("Krishna");
		l.add("Chiru");
		l.add("Venkey");
		l.add("Nag");
		
		System.out.println(l); //[Krishna,Chiru,Venkey,Nag]
		
		ListIterator ltr=l.listIterator();
		while(ltr.hasNext())
		{
			String s=(String)ltr.next();
			if(s.equals("Venkey"))
			{
				ltr.remove();
			}
			else if (s.equals("Nag"))
			{
				ltr.add("Chaitu");
			}
			else if (s.equals("Chiru"))
			{
				ltr.set("Charan");
			}
		}
		System.out.println(l); //[Krishna, Charan, Nag, Chaitu]
	}

}
