package secondaryreference_1;

public class Test {

	public static void main(String args[])
	{
			Salary s=new Salary();
			s.setOsalary(800);
			s.setEsalary(200);

			Employee e=new Employee();
			e.setEid(1);
			e.setEname("AMIT");
			e.setEsalary(s);
			e.setEmob(805575374);

			System.out.println(e.getEid());
			System.out.println(e.getEname());
			System.out.println(e.getEmob());

			System.out.println(e.getEsalary().getOsalary());
			System.out.println(e.getEsalary().getEsalary());

		}
	}

