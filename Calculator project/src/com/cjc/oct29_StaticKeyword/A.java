package com.cjc.oct29_StaticKeyword;

public class A 
{
		static int x;
		int y;
		
		public static void main(String[] args) 
		{
		
			A a=new A();
			a.x=10;
			a.y=20;
			
			A a1=new A();
			a1.x=10;
			a1.y=20;
			
			System.out.println("with a object x="+a.x);
			System.out.println("with a object y="+a.y);
			System.out.println("with a object x="+a1.x);
			System.out.println("with a object y="+a1.y);
			
		}
}

			
			
			
			

