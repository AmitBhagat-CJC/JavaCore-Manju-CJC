package ab.core.one.seventh;

public class EmpTest 
{
	public static void main(String[] args) 
	{
		Emp e1=new Emp();
		e1.setEmpid(101);
		e1.setEmpname("Akash");
		e1.setEmpaddress("Delhi");
		
		Emp e2=new Emp();
		e2.setEmpid(102);
		e2.setEmpname("prakash");
		e2.setEmpaddress("DTumkur");
		
		Emp e3=new Emp();
		e3.setEmpid(103);
		e3.setEmpname("dinesh");
		e3.setEmpaddress("Mirzapur");
		
		System.out.println(e1.getEmpid());
		System.out.println(e1.getEmpname());
		System.out.println(e1.getEmpaddress());
		System.out.println(e2.getEmpid());
		System.out.println(e2.getEmpname());
		System.out.println(e2.getEmpaddress());
		System.out.println(e3.getEmpid());
		System.out.println(e3.getEmpname());
		System.out.println(e3.getEmpaddress());
		
		
		
	}

}
