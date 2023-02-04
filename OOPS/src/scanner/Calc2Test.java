package scanner;

import java.util.Scanner;
public class Calc2Test 
{
public static void main (String []args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println ("Enter first number");
	int a=sc.nextInt();
	System.out.println ("Enter second number");
	int b=sc.nextInt();
	
	Calc2 c=new Calc2();
	c.add(a,b);
	c.sub(a,b);
	c.mul(a,b);
	c.div(a,b);
	}
}

