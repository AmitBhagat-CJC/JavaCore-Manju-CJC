package polymorphism;

	public class A1 
	{
		public void m1()
		{
		System.out.println("m1==A1==default");
		}
		public void m1(int i)
		{	
		System.out.println("m1==A1==int");
		}
		public void m1(String s)
		{	
		System.out.println("m1==A1==String");
		}
		public void m1(int i,int j)
		{	
		System.out.println("m1==A1==int==2");
		}
}
