package Finally_1;

public class A 
{

	public static void main(String[] args) 
	{
		System.out.println("Main --------------Start"); 
		try
		{
			System.out.println("try___________start"); 	
			int i=Integer.parseInt("123"); 	
			System.out.println(i); 		
			System.out.println("try___________end"); 		
		} 		
		catch(NumberFormatException e)
		{ 			
			System.out.println("catch block"); 	
		} 		
		finally
		{ 			
			System.out.println("finally block"); 
		} 		
		System.out.println("Main --------------End"); 	
		} 
		

	}


