package instanceof_4;
//import java.util.ArrayList; 
//import java.util.Iterator;
//import java.util.List;
//import java.util.Scanner;

import java.util.*;
public class Test 
{
	public static void main(String[] args) 
	{
		List list= new ArrayList();
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the Number of Student:");
		
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
			
			list.add(s1);
			
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
		
		
		
		
		/*Student s1=new Student();
		s1.setRollno(1);
		s1.setName("xyz");
		s1.setAddr("Karvenagar");
		
		Student s2=new Student();
		s2.setRollno(2);
		s2.setName("pqr");
		s2.setAddr("Kothrud");
		
		Student s3=new Student();
		s3.setRollno(3);
		s3.setName("lmn");
		s3.setAddr("Warje");
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		
		
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			Object o=itr.next();
			
			if(o instanceof Integer)
			{
				int x=(int)o;
				System.out.println(x);			
			}
			else if (o instanceof String)
			{
				String s =(String)o;
				System.out.println(s);
			}
		
		}
		

	}

}*/
