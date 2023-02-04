package Finallly_Return;

public class Test1 
{
	public int m1()
	{
		int x=10; 
		
		try
		{
		System.out.println("Try==Starts");
		return x;
		}
		finally
		{
		System.out.println("Finally==block");
		}
	}

	public static void main(String[] args) 
	{
		System.out.println("main==starts");
		Test1 t=new Test1();
		int x=t.m1();
		System.out.println(x);
	}
}
		

	
