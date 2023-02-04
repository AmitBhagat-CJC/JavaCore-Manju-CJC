package ab.object;

public class A 
{
	int x;
	public void sum() 
	{
		System.out.println("Hello");
	}
	public static void main(String[] args)
	{
		System.out.println("Main Starts");
		
		A a=new A();
		a.sum();
		a.x=100;
		
		A a1=new A();
		a.sum();
		a1.x=200;
		
		A a2=new A();
		a.sum();
		a2.x=300;
		
		B b =new B();
		b.m2();
		
		System.out.println("Main End");
	}

}
