package com.cjc.karve1;


public class C extends A
{
	public void cc()
	{ 		
		A a=new A(); 
		a.m1();
		a.m2();
		//a.m3(); //private will be access within  class only
		a.m4();//Call methods here which are valid for calling 
        C c=new C(); 
        a.m1();
        a.m2();
  	  //a.m3();//private will be access within  class only
        a.m4();
        //Call methods here which are valid for calling 	
        } 
}


