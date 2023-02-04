package thro_test2;
//Q4. Write the program for custom exception. 	
//(if number is 0 print exception msg as "Zero input number ....") 


public class ZeroInputException extends Exception
{
	public ZeroInputException (String msg)
	{
		super(msg);
	}

}
