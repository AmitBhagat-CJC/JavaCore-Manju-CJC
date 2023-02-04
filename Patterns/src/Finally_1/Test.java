package Finally_1;

public class Test 
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
		finally
		{
			System.out.println("Finally==Block");
		}
		System.out.println("Program End");
			
	}

}
