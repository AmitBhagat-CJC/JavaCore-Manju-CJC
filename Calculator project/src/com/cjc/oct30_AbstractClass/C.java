package com.cjc.oct30_AbstractClass;


// we can not create the object of abstract class

// by using child class object we can call parent abstract class implemented method

public class C extends  A 
{
	
	C c=new C();
	
	A a1=new C();
	
	public static void main(String[] args) 
	{
		C c=new C();
		c.m1();
		
	}
	@Override
		void m2()
		{
			
		}
		
}
