package narrowingerror;

public class A {
	public void m1(Object o)
	{	
	System.out.println("m1===Object");
	}
	public void m1(String s)
	{	
	System.out.println("m1==A==String");
	}
	public void m1(A a)
	{	
	System.out.println("m1==A==");
	}
}

