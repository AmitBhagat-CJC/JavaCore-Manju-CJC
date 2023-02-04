package simple.method;

public class A 
{
	public void add() 
	{
		int a=10,b=20;
		int c=a+b;
		System.out.println("addition is:"+c);
	}
	public static void main(String[] args) 
	{
		A a=new A();
		a.add();
	}

}
