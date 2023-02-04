package Oct11_2;

public class Calc {
	
	public void sum()
	{
		int a=10;
		int b=20;
		int c;
//		c=a+b;
//		System.out.println("Addition of two int is"+c);
		
//		c=a-b;
//		System.out.println("Substraction of two int is "+c);
	
//		c=a*b;
//		System.out.println("Multiplication of two int is"+c);
		
		c=a/b;
		System.out.println("Division of two int is "+c);		
			
	}
	
	public static void main(String[] args) 
	{
		Calc c=new Calc();
		c.sum();
		
	}

}
