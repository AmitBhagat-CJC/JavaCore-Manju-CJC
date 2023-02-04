package Exception;

public class Test 
{ 
	public static void main(String[] args)
	{
		System.out.println("Main==Start");
		try
		{
			System.out.println("try==start");
			String s=args[0];
			int x=Integer.parseInt(s);
			int a =10/x;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Enter input value");
		}
		catch(NumberFormatException e)
		{
			System.out.println("Enter Number");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Enter Non Zero Value");
		}
	
	}
}


	
