package Hashset_1;

import java.util.ArrayList;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class College 
{
	public Set m1()
	{       //set all student data and add it into the set here
				
		Scanner sc=new Scanner(System.in);
		Set s=new HashSet();
			
		Student s1=new Student();		
		System.out.println("Enter your Roll no:");
		int rollno=sc.nextInt();
		s1.setRollno(rollno);
		System.out.println("Enter Your Name:");
		String name=sc.next();
		s1.setName(name);

		Student s2=new Student();
		System.out.println("enter roll no ");
		int roll=sc.nextInt();
		s2.setRollno(roll);
		System.out.println("Enter name");
		String nme=sc.next();
		s2.setName(nme);
		
		s.add(s1);
		s.add(s2);
		
		return s;
		
	} 
	
}


