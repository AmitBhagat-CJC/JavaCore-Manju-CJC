package Finallly_Return;

public class Test3 
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
			return x;
		}
	}

	public static void main(String[] args) 
	{
		System.out.println("main==starts");
		Test3 t=new Test3();
		int x=t.m1();
		System.out.println(x);
	}


}
