package switch_case;

import java.util.Scanner;

public class Calcscanner {

	public static void main(String[] args) 
	{
	
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your input");
		String sym=sc.next();
		switch(sym)
		{
		case 1:
			System.out.println("Addition is :+res");
			break;
			
		case 2:
			System.out.println("Substraction is :+res");
			break;
			
		case 3:
			System.out.println("Multiplication is :+res");
			break;
			
		case 4:
			System.out.println("Division is :+res");
			break;
			
		default:
			System.out.println("error");
		}
	}
	}

}
