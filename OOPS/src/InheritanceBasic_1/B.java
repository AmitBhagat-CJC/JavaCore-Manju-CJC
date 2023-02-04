package InheritanceBasic_1;

public class B extends A
{
	public void m2()
	{
		System.out.println("m2==B");
	}
	public static void main(String[] args)
	{
//		B b=new B();
//		b.m1();
//		b.m2();
//		System.out.println(b.x);
		
		A a=new B();
		a.m1();
		
		System.out.println(a.x);
		
	}

}
