package method.returntype.parameterized;

public class A 
{
	public int div(int a,int b) 
	{
//		int a=50;
//		int b=10;
		int c=a/b;
		return c;
		
//		System.out.println("Division is:-"+c);
	}
	
	public static void main(String[] args) 
	{
		A  a =new A();
		int x=a.div(50, 10);
		System.out.println(x);
		System.out.println(a.div(100, 10));
		System.out.println(a.div(1000, 50));
				
	}

}
