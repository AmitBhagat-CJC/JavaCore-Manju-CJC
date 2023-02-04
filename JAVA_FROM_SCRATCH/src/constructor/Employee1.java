package constructor;
//WITHOUT CONSTRUCTOR
public class Employee1 
{

	private int emp_id;
	private String name;
	
//	public Employee1(int emp_id, String name) 
//	{
//		super();
//		this.emp_id = emp_id;
//		this.name = name;
//	}
	
	public static void main(String[] args) 
	{
		Employee1 e1=new Employee1();
//		Employee1 e1=new Employee1(1,"amit");
		System.out.println(e1.emp_id);
		System.out.println(e1.name);
		
	}


}
