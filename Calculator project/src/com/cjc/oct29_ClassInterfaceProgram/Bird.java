package com.cjc.oct29_ClassInterfaceProgram;

public class Bird 
{

	public static void main(String[] args) 
	{
        Duck d= new Duck(); 
        d.goForward(); 
        d.goDown();   
        
        Finch f= new Finch();
        f.goForward(); 
        f.goDown();     
        
        Fly f1=new Duck();
        f1.goForward(); 
        f1.goDown();
        
       // Fly f1=new Finch();
       // f1.goForward(); 
       // f1.goDown();
        
     } 
		

}


