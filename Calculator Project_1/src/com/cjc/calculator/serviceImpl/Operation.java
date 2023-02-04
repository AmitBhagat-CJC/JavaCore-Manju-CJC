package com.cjc.calculator.serviceImpl;

import com.cjc.calculator.service.Calculator;

import java.io.PrintStream;
import java.util.Scanner;

public class Operation implements Calculator
{
	 public Operation()
	    {
	    }

	    public void add()
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter 1st Number ");
	        int a = sc.nextInt();
	        System.out.println("Enter 2nd Number ");
	        int b = sc.nextInt();
	        int c = a + b;
	        System.out.println((new StringBuilder("Addition is ")).append(c).toString());
	    }

	    public void sub()
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter 1st Number ");
	        int d = sc.nextInt();
	        System.out.println("Enter 2nd Number ");
	        int e = sc.nextInt();
	        int f = d - e;
	        System.out.println((new StringBuilder("Substraction is ")).append(f).toString());
	    }

	    public void mul()
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter 1st Number ");
	        int g = sc.nextInt();
	        System.out.println("Enter 2nd Number ");
	        int h = sc.nextInt();
	        int i = g * h;
	        System.out.println((new StringBuilder("Multiplication is ")).append(i).toString());
	    }

	    public void div()
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter 1st Number ");
	        int j = sc.nextInt();
	        System.out.println("Enter 2st Number ");
	        int k = sc.nextInt();
	        int l = j / k;
	        System.out.println((new StringBuilder("Division is ")).append(l).toString());
	    }

}
