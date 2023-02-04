package secondaryreference_2;


public class Test 
{
	public static void main(String args[])
	{
		Name n=new Name();
		n.setNname("G1");
		n.setOname("JEEVAN");
		
		Mob m=new Mob();
		m.setFirmob(9895989);
		m.setFirmob(7574875);
		
		Employee e=new Employee();
		e.setEid(1);
		e.setEname(n);
		e.setEsalary(400);
		e.setEmob(m);

		System.out.println(e.getEid());
		System.out.println(e.getEname().getNname());
		System.out.println(e.getEname().getOname());
		System.out.println(e.getEsalary());
		System.out.println(e.getEmob().getFirmob());
		System.out.println(e.getEmob().getSecmob());
		
				
	}
	
}
