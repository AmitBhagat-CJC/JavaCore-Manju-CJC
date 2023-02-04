package Finallly_Return;

public class Test2 
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
			x=40;
			System.out.println("Finally==block="+x);
		}
	}

	public static void main(String[] args) 
	{
		System.out.println("main==starts");
		Test2 t=new Test2();
		int x=t.m1();
		System.out.println(x);
	}

}
