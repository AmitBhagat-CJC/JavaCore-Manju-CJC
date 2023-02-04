package constructor2;

public class B 
{
	
	public void m1() 
	{
		System.out.println("m1==method");
	}
	public static void main(String[] args) 
	{
		
		System.out.println("Main==start");
		
		B b=new B();
		
		b.m1();
		
		System.out.println("Main==End");
		
	}

}
