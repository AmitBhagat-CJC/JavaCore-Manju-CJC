package Exception;

public class Test3 
{
	public static void main(String[] args)
	{
		System.out.println("main==starts");
		try
		{
		System.out.println("Try==starts");
		int a=10/0;
		System.out.println(a);
		System.out.println("Try==end");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Catch==Block");
		}
		System.out.println("Main==End");
	}
}
