package Finally_1;

public class Test2 
{

	public static void main(String[] args)
	{
		System.out.println("Main==Start");
		try
		{
			System.out.println("try==start");
			System.out.println(10/0);
			System.out.println("try==end");
		}
		catch(ArithmeticException e)
		{
			System.out.println("catch==block");
		}
		finally
		{
			System.out.println("Finally==Block");
		}
		System.out.println("Program End");
		

	}

}
