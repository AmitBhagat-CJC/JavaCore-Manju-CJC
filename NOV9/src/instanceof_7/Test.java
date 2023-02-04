package instanceof_7;
//Q:3) Write the collection program 
//to set student data using Scanner and list
//and get this data using iterator.

import java.util.*;

public class Test 
{
	public static void main(String[] args) 
	{
		//set (Using scanner and list)
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter your Roll no:");
		int rollno=sc.nextInt();
		System.out.println("Enter Your Name:");
		String name=sc.next();
		System.out.println("Enter Your Adress:");
		String adress=sc.next();
		//System.out.println("-----------------------");
		//System.out.println("Rollno: +rollno");
		//System.out.println("Name:+name");
		//System.out.println("Adress:+adress");
		
		//set (Using  list)
		List list= new ArrayList();
		
		Student s1=new Student();
		s1.setRollno(1);
		s1.setName("xyz");
		s1.setAddr("Narhe");
		
		Student s2=new Student();
		s2.setRollno(2);
		s2.setName("pqr");
		s2.setAddr("Warje");
		
		Student s3=new Student();
		s3.setRollno(3);
		s3.setName("abc");
		s3.setAddr("Kothrud");
		
			
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		//and get this data using iterator.
		
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			Student s=(Student)itr.next();
			System.out.println(s.getRollno());
			System.out.println(s.getName());
			System.out.println(s.getAddr());
			
		}
		
		
		 // and get (Using iterator)your data here
		//Student s=new Student();        		
		//Student s1=new Student();
		//Student s2=new Student() 
	}
		
			

}
