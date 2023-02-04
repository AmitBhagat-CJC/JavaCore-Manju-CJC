package oct11_1;

public class B 
{
	public void sum() 
	{
		System.out.println("method sum==class B");
		
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		B b=new B();
		b.sum();
		System.out.println("main ends");	
	}

}
