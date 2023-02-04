package constructor2;

public class A 
{
	public static void main(String[] args) 
	{
		System.out.println("main==starts");
		
		A a=new A();
		a.m1();
		
	}
	
	public void m1()

	{
		System.out.println("m1===method");
		System.out.println("End");
	}
	
	
}
