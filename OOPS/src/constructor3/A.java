package constructor3;



public class A 
{
	
	public void m1()

	{
		System.out.println("m1===method");
		
	}
	public static void main(String[] args) 
	{
		System.out.println("main==starts");
		
		A a=new A();
		a.m1();
		
		
		B b=new B();
		b.m2();
		
		System.out.println("End");
	}
	
	
	
	
}
