package arithmatic;

public class A 
{
	public static void main(String[] args) 
	{
		System.out.println("Main===Start");
		try
		{
			System.out.println(10/0);
			System.out.println("Try==block");
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("catch==block");
		}
		finally
		{
			System.out.println("finally==block");
		}
		System.out.println("main==end");
	}
	

}
