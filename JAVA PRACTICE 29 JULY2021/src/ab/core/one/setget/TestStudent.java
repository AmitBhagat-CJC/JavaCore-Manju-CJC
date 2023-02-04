package ab.core.one.setget;

public class TestStudent 
{
	public static void main(String[] args) {
		
		
		Student s1=new Student();
		s1.setId(1);
		s1.setName("amit");
		s1.setAddress("yavatmal");
		
		Student s2=new Student();
		s2.setId(2);
		s2.setName("jeevan");
		s2.setAddress("tumkur2");
		
		Student s3=new Student();
		s3.setId(3);
		s3.setName("supreme");
		s3.setAddress("tumkur3");
		
		
		Student s4=new Student();
		s4.setId(4);
		s4.setName("narsi");
		s4.setAddress("tumkur4");
		
		System.out.println(s1.getId());
		System.out.println(s1.getName());
		System.out.println(s1.getAddress());
		
		System.out.println(s2.getId());
		System.out.println(s2.getName());
		System.out.println(s2.getAddress());
		
		System.out.println(s3.getId());
		System.out.println(s3.getName());
		System.out.println(s3.getAddress());
		
		  System.out.println(s4.getId());       
		  System.out.println(s4.getName());     
	    System.out.println(s4.getAddress());  
	}
                                                
}
