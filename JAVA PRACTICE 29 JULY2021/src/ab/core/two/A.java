package ab.core.two;

public class A 
{
	private void sum() 
	{
		System.out.println("Sum methd == A class");
		
	}
	
	public static void main(String[] args) 
	{
		A a=new A();
		a.sum();
		
		B b=new B();
		b.m2();
	}
}
