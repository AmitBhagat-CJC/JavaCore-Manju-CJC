package ThrowsExceptionNotHandle;


//Q6. Complete the code with and without handling exception, 
//what will be the output of the program?

public class A4 
{
	public void m1() 
	{ 				
		System.out.println("m1________A4___Start");		//2
		B4 b=new B4();
		b.m2(); 			
		System.out.println("m1_______A4____End"); 		
		} 		
	
	public static void main(String[] args)
	{ 			
		System.out.println("main _________start"); 			//1
		A4 a=new A4(); 			//handle exception here 				
		a.m1(); 			
		System.out.println("main __________End"); 		
	} 	
	} 
	


