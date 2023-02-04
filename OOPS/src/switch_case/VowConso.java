package switch_case;

import java.util.Scanner;

//Q3. Write the program to check vowel and consonant 
//using switch case give   	
//the character input ( If the character is A, E, I, O, U, a, e, i, o, oru... 	
//Print it is vowel otherwise print consonant ).  

public class VowConso {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println ("Enter choice");
		String ch=sc.next();
		switch(ch)
		{
		case "A":
		case "a":	
			System.out.println("Vowel");
			break;
			
		case "E":
		case "e":	
			System.out.println("Vowel");
			break;
			
		case "I":
		case "i":	
			System.out.println("Vowel");
			break;
			
		case "O":
		case "o":	
			System.out.println("Vowel");
			break;
			
		case "U":
		case "u":	
			System.out.println("Vowel");
			break;
			
		case "E":
		case "e":	
			System.out.println("Consonant");
			break;
			
		case "E":
		case "e":	
			System.out.println("Consonant");
			break;
			
		case "E":
		case "e":	
			System.out.println("Consonant");
			break;
				
		case "E":
		case "e":	
			System.out.println("Consonant");
			break;
				
		case "E":
		case "e":	
			System.out.println("Consonant");
			break;
			
		default:
			System.out.println("Consonant");
			
			
		}

		}
	}


