package inheritance;

public class B extends A
{
	public void m1() 
	{
		System.out.println("m1 method==B");
	}
	public static void main(String[] args) //1
	{
	//	A a = new B();
		A b=new B();
		b.m1();
		System.out.println(b.x); //4
		
	}

}
