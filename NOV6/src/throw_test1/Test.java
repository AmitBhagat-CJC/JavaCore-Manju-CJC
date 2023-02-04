package throw_test1;

public class Test 
{
	public static void main(String[] args) 
	{
		System.out.println("main==start"); //1
		try
		{
			VotingClass v=new VotingClass(); //Handle exception and print exception msg here. 
			v.voting(15);	
		}
		catch(ArithmeticException e)
		{
			System.out.println("catch==block" +e.getMessage());
		}
		System.out.println("Not Eligible for voting");

	}

}
