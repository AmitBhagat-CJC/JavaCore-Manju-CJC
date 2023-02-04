package ab.core.one.constructor;

public class Test 
{
	public static void main(String[] args) 
	{
		Student s1=new Student(1,"amit","yavatmal");
		Student s2=new Student(2,"narsi","tumkur1");
		Student s3=new Student(3,"jeevan","tumkur2");
		Student s4=new Student(4,"supreme","tumkur3");
		
		System.out.println(s1.rollno);
		System.out.println(s1.name);
		System.out.println(s1.address);
		                   
		System.out.println(s2.rollno);
		System.out.println(s2.name);
		System.out.println(s2.address);
		
		System.out.println(s3.rollno);
		System.out.println(s3.name);
		System.out.println(s3.address);
		
		System.out.println(s4.rollno);
		System.out.println(s4.name);
		System.out.println(s4.address);

	}
}
