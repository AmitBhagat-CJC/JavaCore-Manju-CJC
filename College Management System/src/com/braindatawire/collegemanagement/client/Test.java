package com.braindatawire.collegemanagement.client;
import java.util.*;
import java.util.Scanner;
import com.braindatawire.collegemanagement.service.*;
import com.braindatawire.collegemanagement.serviceImpl.Karvenagar;
public class Test 
{
	public static void main(String[] args) 
	{
											//As per user, Call all Karvenagar class methods here using switch case
			Scanner sc = new Scanner(System.in);
			Karvenagar k=new Karvenagar();
			
			 do
		        {
			
				 while(true)
				 {			
					 System.out.println("Select Appropriate Option");
					 System.out.println("--------------------------");
					 System.out.println("Press 1 to Add Course ");
					 System.out.println("Press 2 to View Course ");
					 System.out.println("Press 3 to Add Faculty");
					 System.out.println("Press 4 to View Faculty");
					 System.out.println("Press 5 to Add Batch");
					 System.out.println("Press 6 to View Batch");
					 System.out.println("Press 7 to Add Student");
					 System.out.println("Press 8 to View Student");
					 System.out.println("Press 9 to E X I T");
					 System.out.println("------------------------");
					 int op = sc.nextInt();
					 switch(op)
					 {
					 	case 1:
					 		k.addCourse();
					 		break;
					 	case 2: 
					 		k.viewCourse();
					 		break;
					 	case 3:
					 		k.addFaculty();
					 		break;
					 	case 4: 
					 		k.viewFaculty();
					 		break;
					 	case 5:
					 		k.addBatch();
					 		break;
					 	case 6: 
					 		k.viewBatch();
					 		break;
					 	case 7:
					 		k.addStudent();
					 		break;
					 	case 8: 
					 		k.viewStudent();
					 		break;
					 	case 9:
							System.out.println("Thank You");
							System.exit(0);
				            
					 	default :
					 		System.out.println("please enter correct input");
		           	                       	
					 }
					 
				   }
		        }while(true);
		}
}




	


