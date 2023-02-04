package ab.core.one.sixth;

public class Test 
{
	public static void main(String[] args) 
	{
		Employee e=new Employee();
		e.setEmpid(101);
		e.setEmpname("kunal");
		
		Employee e1=new Employee();
		e1.setEmpid(102);
		e1.setEmpname("Manju");
		
		Employee e2=new Employee();
		e2.setEmpid(103);
		e2.setEmpname("Ranjana");
		
		Employee birendra=new Employee();
		birendra.setEmpid(104);
		birendra.setEmpname("Birendra Pal");
		
		Employee surendra=new Employee();
		surendra.setEmpid(104);
		surendra.setEmpname("surendra Bar");
		
		
		System.out.println(e.getEmpid());
		System.out.println(e.getEmpname());
		System.out.println(e1.getEmpid());
		System.out.println(e1.getEmpname());
		System.out.println(e2.getEmpid());
		System.out.println(e2.getEmpname());
		System.out.println(birendra.getEmpid());
		System.out.println(birendra.getEmpname());
		System.out.println(surendra.getEmpid());
		System.out.println(surendra.getEmpname());
		
		
	}

}
