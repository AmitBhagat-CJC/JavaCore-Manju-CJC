package thro_test2;
//Q4. Write the program for custom exception. 	
//(if number is 0 print exception msg as "Zero input number ....") 

public class Number 
{
	public void getNumber(int i) throws ZeroInputException
	{ 		//Write the custom exception here. 	
		System.out.println("start");
		
		if (i==0)
		{
			
			ZeroInputException z=new ZeroInputException("Zero input number");
					throw z;
		}
		System.out.println("valid input");
		} 
	}


