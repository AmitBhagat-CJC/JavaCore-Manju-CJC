package ab.core.exception.one;

public class A 
{
	public static void main(String[] args) 
	{
		
		try
		{
			String name=null;
			System.out.println(name.length());
					
		}
		catch(NullPointerException e)
		{
			System.out.println("THIS IS NPE");
		}
		catch (Exception e)
		{
			System.out.println("THIS IS E");
		}
		
	}

}
