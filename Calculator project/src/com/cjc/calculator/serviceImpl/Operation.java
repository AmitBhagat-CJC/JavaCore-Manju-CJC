package com.cjc.calculator.serviceImpl;

public class Operation 
{
	int a=10;
	int b=20;
		{
			public void add()
			{
				int c=a+b;
				System.out.println("add="+c);
			}
			public void sub()
			{
	
				int c=a-b;
				System.out.println("sub="+c);
			}
			public void mul()
			{
	
				int c=a*b;
				System.out.println("mul="+c);
			}
			public void div()
			{
					int c=a/b;
				System.out.println("div="+c);
			}
			default:
				System.out.println("Invalid Symbol");
				break;
	}
	}

