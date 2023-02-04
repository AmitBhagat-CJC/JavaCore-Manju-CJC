package switch_case;
import java.util.*;
//Q4. Write the calculator program as per dynamic input perform operation 	
//using switch case in same class. 

public class Calc 
{
	public static void main(String[] args) 
	{
		int no1=40,no2=20,res;
		String sym="+" ;
		switch(sym)
		{
			case "+": 
			res=no1+no2;
			System.out.println(res);
			break;
			
			case "-": 
			res=no1-no2;
			System.out.println(res);
			break;
			
			case "*": 
			res=no1*no2;
			System.out.println(res);
			break;
			
			case "/": 
			res=no1/no2;
			System.out.println(res);
			break;
			
			default:
			System.out.println("Invalid Symbol");
			break;
		}
	}
}


