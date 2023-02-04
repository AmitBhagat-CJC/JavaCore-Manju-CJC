package Throws_Unchecked;
//Q7. Complete the code with handling exception 
// and write the output of the program 


public class A1 
{	
	public void m1()
	{ 		
		System.out.println("m1________A1"); 		//2
		B1 b=new B1(); 		//Handle Exception Here
		try
		{
		b.m2(); 
		}
		catch(ArithmeticException e)
		{
			System.out.println("catch block");
		}
		System.out.println("m1_______A1____End"); 	
	} 	
	public static void main(String[] args)
	{ 		
		System.out.println("main _________start"); 		//1
		A1 a=new A1(); 		
		a.m1(); 		
		System.out.println("main __________End"); 	
	} 

}
