package throw_test;

public class Custom 
{
	public void m1(int age) 
	{
		System.out.println("m1==start");
		if (age<0)
		{
			ArithmeticException e=new ArithmeticException("Age Problem");
			throw e;
		}
		System.out.println("m1==end");
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println("main==start");
		try
		{
			Custom c=new Custom();
			c.m1(-5);
		}
		catch(ArithmeticException e)
		{
			System.out.println("catch==block" +e.getMessage());
		}
		System.out.println("main==end");
	}
}
	


