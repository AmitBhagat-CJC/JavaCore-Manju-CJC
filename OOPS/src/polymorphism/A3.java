package polymorphism;

public class A3 
{
	public void display()
	{
		System.out.println("display_method"); 	
	} 
	public int display(int x)
	{ 		
	return x; 
	}
	public void display(String msg)
	{
	System.out.println("display_String_method msg: "+msg); 	
	} 
	public double display(double a,double b)
	{ 
	return a+b;
	}
}
