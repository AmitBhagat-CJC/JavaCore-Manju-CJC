package ThrowsExceptionNotHandle;

//Q5. Complete the code with handling exception and 
// write the output of the program 


public class A3 
{
	public void m1() throws ClassNotFoundException 
	{ 		
		System.out.println("m1________A3_____Start");	//2
		B3 b=new B3(); 
		b.m2(); 	
		System.out.println("m1_______A3____End"); 	
	} 	
	
	
	public static void main(String[] args)
	{ 		
		System.out.println("main _________start");		 //1
		A3 a=new A3(); 		//handle Exception here.
		try
		{
			a.m1(); 	
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("catch");
		}
			
		System.out.println("main __________End"); 	
	} 
} 


