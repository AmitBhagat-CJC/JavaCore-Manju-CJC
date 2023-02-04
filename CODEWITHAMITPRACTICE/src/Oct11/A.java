package Oct11;

public class A 
{
	public void sum()
	{
		System.out.println("Hello Amit");
	}
	
	public static void main(String[] args)
	{
		System.out.println("Main Start");
		
		A a=new A();
		a.sum();
		
		B b=new B();
		b.m2();
		
		System.out.println("Main End");
		
	}
	
}
