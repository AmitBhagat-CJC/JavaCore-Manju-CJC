package polymorphism;

public class Test3 
{
	public static void main(String[] args) 
		{
		// TODO Auto-generated method stub
		A3 a=new A3();
		int x=a.display(20);
		System.out.println("display_int_method output:"+x); 		
		double y=a.display(10.1, 10.1); 
		System.out.println("display_double_method output: "+y); 
		a.display("Hello"); 		
		a.display();
	}

}
