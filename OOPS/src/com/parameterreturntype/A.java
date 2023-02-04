package com.parameterreturntype;

public class A 
{
	 public int add(int a,int b) 
	 {
		int sum=a+b;
		return sum;
		
	}
	 public static void main(String[] args) 
	 {
		 A a =new A();
		 
		 int x=a.add(10, 20);
		 
		 int result=x+120;
		 
		 System.out.println(result);
		
	}

}
