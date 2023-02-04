package scanner;

import java.util.Scanner;

//program with return type method 
// using Scanner in two class. 
public class Calc3 
{
	public int add ()
		{
		Scanner sc = new Scanner(System.in);
		System.out.println ("Enter first number");
		int a=sc.nextInt();
		System.out.println ("Enter second number");
		int b=sc.nextInt();
		int c=a+b;
		return c;
		}
	
	public int sub ()
		{
		Scanner sc = new Scanner(System.in);
		System.out.println ("Enter first number");
		int a=sc.nextInt();
		System.out.println ("Enter second number");
		int b=sc.nextInt();
		int c=a-b;
		return c;
		}
	
	public int mul ()
		{
		Scanner sc = new Scanner(System.in);
		System.out.println ("Enter first number");
		int a=sc.nextInt();
		System.out.println ("Enter second number");
		int b=sc.nextInt();
		int c=a*b;
		return c;
		}
	public int div ()
		{
		Scanner sc = new Scanner(System.in);
		System.out.println ("Enter first number");
		int a=sc.nextInt();
		System.out.println ("Enter second number");
		int b=sc.nextInt();	
		int c=a/b;
		return c;
		}
}
