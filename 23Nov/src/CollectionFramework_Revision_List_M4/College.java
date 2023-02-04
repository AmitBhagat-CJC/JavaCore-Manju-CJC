package CollectionFramework_Revision_List_M4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class College {
	
	public List m1()
	{     		
		//set and add student data into list here 
		Scanner sc=new Scanner(System.in);
		
		List list=new ArrayList();
		
		Student s1=new Student();		
		System.out.println("Enter Rollno for Student 1:");
		int x=sc.nextInt();
		s1.setRollno(x);
		System.out.println("Enter Name for student 1:");
		String st=sc.next();
		s1.setName(st);

		Student s2=new Student();
		System.out.println("Enter  Rollno for Student 2: ");
		int x1=sc.nextInt();
		s2.setRollno(x1);
		System.out.println("Enter  Name for student 2:");
		String st1=sc.next();
		s2.setName(st1);
		
		list.add(s1);
		list.add(s2);
		
		return list;
		
	} 
}
