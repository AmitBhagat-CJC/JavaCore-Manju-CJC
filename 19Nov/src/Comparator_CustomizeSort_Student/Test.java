package Comparator_CustomizeSort_Student;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test 
{
	public static void main(String[] args) 
	{
		String yn=" ";
		do
		{
				Student s1=new Student();
					s1.setRollno(2);
					s1.setName("jeevan");
				Student s2=new Student();
					s2.setRollno(1);
					s2.setName("supreme");
				Student s3=new Student();
					s3.setRollno(3);
					s3.setName("narsi");
				Set<Student>s=null;
				System.out.println("----select----\n" +"1.Rollno Sort \n" +"2.Name Sort");
				
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the Choice");
		
				int ch=sc.nextInt();
				switch(ch)
				{
					case 1:
						s=new TreeSet<>(new RollnoSort());
						break;
			
					case 2:
						s=new TreeSet<>(new NameSort());
				}
						s.add(s1);
						s.add(s2);
						s.add(s3);
					for(Student stu:s)
					{
						System.out.println(stu.getRollno());
						System.out.println(stu.getName());
					}
					System.out.println("Do you want to continue (Press y for Yes and N for No)");
					yn=sc.next();
				
		}while(yn.equals("y")|| yn.equals("Y"));
	}
}
		

	

				


