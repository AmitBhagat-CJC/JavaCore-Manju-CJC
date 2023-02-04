package com.braindatawire.collegemanagement.client;
import java.util.Scanner;

import com.braindatawire.collegemanagement.serviceImpl.Karvenagar;
public class Test 
{
		public static void main(String[] args) 
		{
			Karvenagar k = new Karvenagar();
			while(true)
			{
				Scanner sc = new Scanner(System.in);
				
				System.out.println("1. Add Course");
				System.out.println("2. View Course");
				System.out.println("3. Add Faculty");
				System.out.println("4. View Faculty");
				System.out.println("5. Add Batch");
				System.out.println("6. View Batch");
				System.out.println("7. Add Student");
				System.out.println("8. View Student");
			
				System.out.print("Enter your choice: ");
				int ch=sc.nextInt();
				
				switch (ch) 
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

				default:
					break;
				}
			}
		}
}



