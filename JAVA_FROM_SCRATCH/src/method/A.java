package method;

public class A 
{
	public void m1() 
	{
		System.out.println("method m1==Class A");
		
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		
		A a=new A();
		a.m1();
		System.out.println("Main End");
		
	}
}
