package Finally_1;

public class Test11 {

	public static void main(String[] args) 
	{
		try
		{
			int i=10/0;
			System.out.println(i);
		}
		
		finally
		{
			System.out.println("finally block");
		} 
		catch(ArithmeticException e)
		{         							// sequence --> try-->catch-->finally
			
			System.out.println("catch block");         // compile time error
		} 
		
		
	}

}
