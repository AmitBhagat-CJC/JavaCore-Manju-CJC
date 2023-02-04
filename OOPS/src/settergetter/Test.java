package settergetter;

import java.util.Scanner;


	public class Test
	{
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
	
			Student s=new Student();
//			Student s1=new Student();
			
			int rollno=sc.nextInt();
			String name=sc.next();
			String address=sc.next();
			
			 s.setRollno(rollno);
			 s.setName(name);
			 s.setAddress(address);
			 
			System.out.println(s.getRollno());
		    System.out.println(s.getName());
		    System.out.println(s.getAddress());
		}
	}	

	
	


