package method.parameterized;

public class A 
{
	public void sub(int a,int b) 
	{
		int c=a-b;
		System.out.println("Substraction is:-"+c);
	}
	public static void main(String[] args) 
	{
		A a=new A();
		a.sub(20,10);
	
	}	
	

}
