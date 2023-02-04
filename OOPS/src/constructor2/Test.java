package constructor2;

public class Test
{
	public static void main(String[] args) 
	{
		Student s1=new Student(101, "deepak");

		Student s2=new Student(102, "sumit");
		
		System.out.println(s1.rollno);
		System.out.println(s1.name);
		System.out.println(s2.rollno);
		System.out.println(s2.name);
	}

}
