package Throws_Unchecked;

public class B1 
{
	public void m2()
	{
		System.out.println("B1_________m2 Start");		//3
		int a=10/0; 									
		System.out.println(a); 		
		System.out.println("B1_________m2 End"); 	
	} 
	
}


