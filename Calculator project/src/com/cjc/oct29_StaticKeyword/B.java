package com.cjc.oct29_StaticKeyword;

public class B 
{
		static int x;
		int y;
		
		public static void main(String[] args) 
		{
		
			B b=new B();
			b.x=10;
			b.y=20;
			
			B b1=new B();
			b1.x=10;
			b1.y=20;
			
		
			
			System.out.println("with a object x="+b.x);
			System.out.println("with a object y="+b.y);
			System.out.println("with a object x="+b1.x);
			System.out.println("with a object y="+b1.y);
		
		}
}


	
