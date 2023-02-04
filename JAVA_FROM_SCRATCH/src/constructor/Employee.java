package constructor;
//WITH CONSTRUCTOR
public class Employee 
{
	private int emp_id;
	private String name;
	
	public Employee(int emp_id, String name) {
		super();
		this.emp_id = emp_id;
		this.name = name;
	}
	
	public static void main(String[] args)
	{
		Employee e=new Employee(1, "Amit");
		System.out.println(e.emp_id);
		System.out.println(e.name);
		
		Employee e1=new Employee(2, "dEEPAK");
		System.out.println(e1.emp_id);
		System.out.println(e1.name);
		
		Employee e2=new Employee(3, "Sumit");
		System.out.println(e2.emp_id);
		System.out.println(e2.name);
		
		Employee e3=new Employee(4, "AJAX");
		System.out.println(e3.emp_id);
		System.out.println(e3.name);
		
		
	}
	
	
}
