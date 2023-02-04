 package scanner;
import java.util.Scanner;

public class Test 
{
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		Test t=new Test();
		t.display();
	}
	
	private void display() 
	{
		Student s=new Student();
		System.out.println("Enter Roll No");
		int rollno=sc.nextInt();
		s.setRollno(1);
		
		
		 //set and get your data here
		System.out.println("Enter Roll No");
		int rollno1=sc.nextInt();
		System.out.println("Enter Name");
		String name=sc.next();
		System.out.println("Enter Adress");
		String Adress=sc.next();
		System.out.println("==========");
		System.out.println("Rollno:"+rollno1);
		System.out.println("Name:"+name);
		System.out.println("Adress:"+Adress);
		
		Student s1=new Student();
		s1.setRollno(1);
		Student s11=new Student();
		
	}

}
