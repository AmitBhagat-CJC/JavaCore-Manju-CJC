package ab.core.three;

public class A 
{
	int x;
	
	private static void sum() 
	{
		System.out.println(" sum method== A Class");
		
	}
	public static void main(String[] args) 
	{
		A a=new A();
		a.sum();
		
		B b=new B();
		b.run();
		
		C c=new C();
		c.eat();
		
	}
}
