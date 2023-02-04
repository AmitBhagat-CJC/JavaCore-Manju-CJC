package Exception;

public class Test2 
{
	public static void main(String[] args) 
	{
		System.out.println("main==Starts");
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("catch==block");
		}
		System.out.println("main==end");
				
	}

}
