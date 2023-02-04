package Finallly_Return;

public class Test0 
{
	public int m1()
	{
		System.out.println("m1==test");
		if (true)
		{
			return 10;
		}
		System.out.println("Hello");
		return 20;
	    }
	

	public static void main(String[] args) 
	{
		System.out.println("main==starts");
		Test0 t=new Test0();
		int x=t.m1();
		System.out.println(x);
	}

}
