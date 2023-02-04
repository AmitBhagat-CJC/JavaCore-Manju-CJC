package oct11;

public class A 
{
	public void sum() 
	{
		System.out.println("method sum==class A");
		
	}
	
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		A a = new A();
		a.sum();
		
		B b=new B();
		b.m2();
		System.out.println("main==end");
	}

}
