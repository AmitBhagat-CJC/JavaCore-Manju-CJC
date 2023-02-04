package oct11_1;

public class C 
{
	public void sum() 
	{
		System.out.println("Method sum==class C");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		
		C c=new C();
		c.sum();
		System.out.println("Main Ends");
	}
}
