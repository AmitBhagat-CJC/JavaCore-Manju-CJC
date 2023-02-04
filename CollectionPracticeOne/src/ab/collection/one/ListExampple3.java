package ab.collection.one;
import java.util.*;
public class ListExampple3 
{
	public static void main(String[] args) 
	{
		ArrayList <String>	books=new ArrayList();
		
		books.add("constitution");
		books.add("bible");
		books.add("kuran");
		
	System.out.println(books);
		
					ListIterator<String> litr=books.listIterator(books.size());
					
					while(litr.hasNext())
					{
						String val=litr.previous();
						System.out.println(val);
					}
		
	}
	

}
