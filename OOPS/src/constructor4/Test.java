package constructor4;

public class Test 
{
	public static void main(String[] args) 
	{
		
		
		Student s1=new Student();
		s1.setRollno(101);
		s1.setName("Deepika");
		
		Student s2=new Student();
		s2.setRollno(102);
		s2.setName("vir");
		
		System.out.println(s1.getRollno());
		System.out.println(s1.getName());
		System.out.println(s2.getRollno());
		System.out.println(s2.getName());
		
	 }
	

}
