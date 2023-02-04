package method.returntype;

public class A 
{
	public int mul() 
	{
		int a=10;
		int b=20;
		int c=a*b;
		return c;
	}
	public static void main(String[] args) 
	{	
		A a=new A();
		int x=a.mul();
		System.out.println(x);
		
		System.out.println(a.mul());
	}
}
