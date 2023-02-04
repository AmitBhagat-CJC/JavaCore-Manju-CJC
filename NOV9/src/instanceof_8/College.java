package instanceof_8;
import java.util.*;
public class College 
{
	
	public List m1()
	{     		
		//set and add student data into list here 
		Scanner sc=new Scanner(System.in);
		
		List list=new ArrayList();
		
		Student s1=new Student();	
		
		System.out.println("Enter your Roll no:");
		int x=sc.nextInt();
		s1.setRollno(x);
		
		System.out.println("Enter Your Name:");
		String st=sc.next();
		s1.setName(st);

		Student s2=new Student();
		
		System.out.println("enter roll no ");
		int x1=sc.nextInt();
		s2.setRollno(x1);
		
		System.out.println("Enter name");
		String st1=sc.next();
		s2.setName(st1);
		
		list.add(s1);
		list.add(s2);
		
		return list;
		
	} 
	
 }


