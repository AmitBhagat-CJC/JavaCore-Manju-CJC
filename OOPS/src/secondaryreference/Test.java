package secondaryreference;

public class Test 
{
	public static void main(String args[])
	{
		Address ad=new Address();
		ad.setAreaname("KARVENAGAR");
		ad.setCityname("PUNE");
		
	
		Student stu=new Student();
		stu.setRollno(21);
		stu.setName("SUPREME");
		stu.setAddress(ad);
		
	
	
		System.out.println(stu.getRollno());
		System.out.println(stu.getName());
		System.out.println(stu.getAddress().getAreaname());
		System.out.println(stu.getAddress().getCityname());
	}
}
