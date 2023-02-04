package scanner;
//1.	Write down calculator program with local variable in single class
//      using Scanner in single class
import java.util.Scanner;

public class Calc 
{
	Scanner sc = new Scanner(System.in);
	public void add()
	{
		System.out.println ("Enter first number");
		int a=sc.nextInt();
		System.out.println ("Enter second number");
		int b=sc.nextInt();
		int c=a+b;
		System.out.println ("Addition of a &b :"+c);
	}

public void sub ()
{
	System.out.println ("Enter first number");
	int a=sc.nextInt();
	System.out.println ("Enter second number");
	int b=sc.nextInt();
	int c=a-b;
	System.out.println("Substraction of Two is "+c);
}

public void mul ()
{
	System.out.println ("Enter first number");
	int a=sc.nextInt();
	System.out.println ("Enter second number");
	int b=sc.nextInt();
	int c=a*b;
	System.out.println("Multiplication of Two is "+c);
}

public void div ()
{
	System.out.println ("Enter first number");
	int a=sc.nextInt();
	System.out.println ("Enter second number");
	int b=sc.nextInt();
	int c=a/b;
	System.out.println("Division of Two is "+c);
}

	public static void main (String []args)
	{
	Calc c=new Calc();
	c.add();
	c.sub();
	c.mul();
	c.div();
	}
}
