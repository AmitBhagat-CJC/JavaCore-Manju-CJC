package switch_case;
//Q5. What is the ouput of the program. 
public class Test {    	
	public static void main(String args[]) 
	{        		
		char grade = 'C';
		switch(grade) 
		{          			
		case 'A' :             			
			System.out.println("Excellent!");  
			break;          			
			case 'B' :          			
				case 'C' :       
					System.out.println("Well done");  
					case 'D' :             		
						System.out.println("You passed");    
						case 'F' :             			
							System.out.println("Better try again"); 
							break;          			
							default :             			
								System.out.println("Invalid grade");
								}       	
		
System.out.println("Your grade is " + grade);  
} 
}
