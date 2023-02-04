package with.constructor;

public class TestStudent
{
	public static void main(String[] args)
	{
		Student s1=new Student(1,"AMIT");
		Student s2=new Student(2,"ASHOK");
		Student s3=new Student(3,"ASHISH");
		Student s4=new Student(4,"ASVAIT");
		
		
		
		System.out.println(s1.rollno);
		System.out.println(s1.name);
		System.out.println(s2.rollno);
		System.out.println(s2.name);
		System.out.println(s3.rollno);
		System.out.println(s3.name);
		System.out.println(s4.rollno);
		System.out.println(s4.name);
	
		
	}

}
