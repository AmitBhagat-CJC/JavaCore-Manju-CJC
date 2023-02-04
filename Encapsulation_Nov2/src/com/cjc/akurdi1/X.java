package com.cjc.akurdi1;
import com.cjc.karve1.*;

public class X extends A
{ 	
	public void xx()
	{	                
		A a=new A();
		a.m1();
		//a.m2();no default method
		//a.m3();no private method
		//a.m4();no protected method
		
		//Call methods here which are valid for calling 		 		
		X x=new X();
		a.m1();
		//a.m2();no default method
		//a.m3();no private method
		//a.m4();no protected method
		//Call methods here which are valid for calling 	
		// } } 
	}
}
