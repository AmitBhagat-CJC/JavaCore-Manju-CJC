package throw_test1;

import throw_test.Custom;

//Q3. Write the program for custom exception. 
//(if age is less than 18 print exception msg as "Not Eligible for voting" 
//otherwise print "Welcome to voting").


public class VotingClass 
{
	public void voting(int age)
	{   			//write exception msg here.
		System.out.println("voting start");
		if (age<18)
		{
			ArithmeticException e=new ArithmeticException("Not Eligible for voting");
			throw e;
		}
		else
		{
		System.out.println("Welcome to voting");
	    }  
	}
	
	

	
}  
		


