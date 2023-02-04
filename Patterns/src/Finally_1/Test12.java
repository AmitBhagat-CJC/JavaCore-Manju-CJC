package Finally_1;

public class Test12 
{
	public static void main(String[] args) 
	{
		
	System.out.println("Main------------Start");
	
	try
	{
		System.out.println("Try____Start");
		int i=45/0;         
		System.out.println(i);      
	}      
	catch(ArrayIndexOutOfBoundsException e)
	{         
		System.out.println("Catch _________Block");      
	}      
	finally
	{         
		System.out.println("finally block");      // Abnormal Termination
	}      
	System.out.println("Main------------End");    
	} 

}
