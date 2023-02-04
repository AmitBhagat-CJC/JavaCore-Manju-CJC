package scanner;

import java.util.Scanner;

public class Calc3Test 
{
	public static void main (String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println ("Enter first number");
		int a=sc.nextInt();
		System.out.println ("Enter second number");
		int b=sc.nextInt();
		
		Calc3 c=new Calc3();
		int x= c.add();
		int y= c.sub();
		int z= c.mul();
		int w= c.div();
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(w);
		
		
	}
}

