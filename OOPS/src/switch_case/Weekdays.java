package switch_case;

import java.util.Scanner;

//Q1. Write the program to print weekdays using switch case 
// give the String	input from user.

public class Weekdays 
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println ("Enter your day by number");
		String name=sc.next();
		switch(name)	
		{
		case "1":
			System.out.println("Mon");
			break;
			
		case "2":
			System.out.println("Tue");
			break;
			
		case "3":
			System.out.println("Wed");
			break;
			
		case "4":
			System.out.println("Thr");
			break;
			
		case "5":
			System.out.println("Fri");
			break;
			
		case "6":
			System.out.println("Sat");
			break;
			
		case "7":
			System.out.println("Sun");
			break;
			
		default:
			System.out.println("is not a weekday");
			
			
		}


	}

}
