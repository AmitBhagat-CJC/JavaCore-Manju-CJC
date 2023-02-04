package scanner;
//Write down calculator program with parameter 
//and with return type using Scanner in two class

import java.util.Scanner;

public class Calc4Test 
{
	public static void main (String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println ("Enter first number");
		int a=sc.nextInt();
		System.out.println ("Enter second number");
		int b=sc.nextInt();
		
		Calc4 c=new Calc4();
		c.add(a,b);
		c.sub(a,b);
		c.mul(a,b);
		c.div(a,b);
		
	}
}
