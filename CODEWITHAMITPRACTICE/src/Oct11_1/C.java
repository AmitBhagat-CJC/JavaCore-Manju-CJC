package Oct11_1;

public class C 
{
	
	public void sum()
	{
		System.out.println("sum==c");//2
	}
	public static void main(String[] args) 
	{
		System.out.println("Main==Start"); //1
		
		C c=new C();
		c.sum();
		
	}

}
