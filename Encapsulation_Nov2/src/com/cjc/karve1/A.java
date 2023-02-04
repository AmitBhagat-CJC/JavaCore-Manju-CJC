package com.cjc.karve1;

public class A 
{
	public void m1()
	{
		System.out.println("public m1_____A"); 	
	}
	void m2()
	{
		System.out.println("default m2_____A"); 	
	} 	
	private void m3()
	{ 		
		System.out.println("private m3_____A"); 	
	} 	
	protected void m4()
	{ 		
		System.out.println("protected m4_____A"); 	
	} 	
	public void aa()
	{ 	  
	  A a=new A();
	  a.m1();
	  a.m2();
	  a.m3();
	  a.m4();//Call methods here which are valid for calling 	} } 
	}

}
