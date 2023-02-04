package throw_test;

public class Jvm 
{

		public void m1() 
		{
			System.out.println("m1==start");
			int a=10/0;
			System.out.println("m1==end");
		}
				
		public static void main(String[] args) 
		{
			System.out.println("main==start");
			try 
			{
				Jvm t =new Jvm();
				t.m1();
			}
	   		catch(ArithmeticException e)
			{
				System.out.println("catch==block=="+e.getMessage());
			}
			System.out.println("main==end");
		}

}
