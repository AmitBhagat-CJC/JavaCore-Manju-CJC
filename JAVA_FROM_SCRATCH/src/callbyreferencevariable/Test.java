package callbyreferencevariable;

public class Test 
{
	public static void main(String[] args) 
	{
		
		Student birendra=new Student();
		birendra.setRollno(1);
		birendra.setName("Birendra G");
		
		System.out.println(birendra.getRollno());
		System.out.println(birendra.getName());
		
		
		Student avinash=new Student();
		avinash.setRollno(2);
		avinash.setName("Avinash H");
		
		System.out.println(avinash.getRollno());
		System.out.println(avinash.getName());
		
	}

}
