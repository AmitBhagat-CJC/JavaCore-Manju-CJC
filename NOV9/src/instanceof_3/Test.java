package instanceof_3;

import java.util.Scanner;
import java.util.*;

public class Test 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter Details");
		
		List list= new ArrayList();
		
		Student s1=new Student();
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
			Student stu=(Student)itr.next();
			System.out.println(stu.getRollno());
			System.out.println(stu.getName());
			System.out.println(stu.getAddr());
			
		}
		

	}

}
