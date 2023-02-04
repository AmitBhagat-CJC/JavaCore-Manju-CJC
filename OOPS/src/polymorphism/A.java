package polymorphism;

public class A 
{
	public void m1()
	{
	System.out.println("m1==A==default");
	}
	public void m1(int i)
	{	
	System.out.println("m1==A==int");
	}
	public void m1(String s)
	{	
	System.out.println("m1==A==String");
	}
	public void m1(int i,int j)
	{	
	System.out.println("m1==A==int==2");
	}
}

