package method.toString;

public class Test 
{
	public static void main(String[] args) 
	{
		Student s1=new Student();
		s1.rollno=1;
		s1.name="Deepika";
		s1.address="Amravati";
		
		Student s2=new Student();
		s2.rollno=1;
		s2.name="Amit";
		s2.address="Yavtmal";
		
		System.out.println(s1);
		System.out.println(s2);
		
		Student s3=new Student();
		s3.setRollno(55);
		s3.setName("SUDHA");
		s3.setAddress("Pune");
		
		Student s4=new Student();
		s4.setRollno(56);
		s4.setName("RAJA");
		s4.setAddress("YtL");
		
		System.out.println(s3.getRollno());
		System.out.println(s3.getName());
		System.out.println(s3.getAddress());
		
		System.out.println(s4.getRollno());
		System.out.println(s4.getName());
		System.out.println(s4.getAddress());
	}
}
