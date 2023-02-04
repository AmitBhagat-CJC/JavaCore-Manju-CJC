package constructor3;

public class Test 
{
	
	public static void main(String[] args) 
	{
		Student s1=new Student();
		
		s1.setRollno(1);
		s1.setName("Deepak");
		
		System.out.println(s1.getRollno());
		System.out.println(s1.getName());
		
	}

}
