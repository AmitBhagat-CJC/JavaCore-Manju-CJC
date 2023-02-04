package CollectionFramework_Revision_List_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

//Q:9) WAP to set Student data usiing scanner and get this data using Iterator

public class Test {

	public static void main(String[] args) {
				
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the Number of Student:");
		
		List list= new ArrayList();
		int k=sc.nextInt();// --> Instance Variable
		for(int j=1;j<=k;j++)
		{
			Student s1=new Student();
			System.out.println("Enter Rollno for student "+j+":");
			int x= sc.nextInt(); //-->Local Variable
			s1.setRollno(x);
			
			System.out.println("Enter Name for student "+j+":");
			String s= sc.next();
			s1.setName(s);
			
			Student s2=new Student();
			System.out.println("Enter Rollno for student 2 "+j+":");
			int x1= sc.nextInt(); //-->Local Variable
			s2.setRollno(x1);
			
			System.out.println("Enter Name for student 2 "+j+":");
			String st= sc.next();
			s2.setName(st);
			
			
			list.add(s1);
			list.add(s2);
			
			Iterator itr=list.iterator();
			while(itr.hasNext())
			{
				Student stu=(Student)itr.next();
				System.out.println(stu.getRollno());
				System.out.println(stu.getName());
				
			}
			
	
		}
		
	}
}
