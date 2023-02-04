package oct11_1;

public class D 
{
	public void sub() 
	{
		System.out.println("Method sub==class D");
		
	}
	public void add() 
	{
		System.out.println("Method add==class D");
		
	}
	public void div() 
	{
		System.out.println("Method div==class D");
		
	}
	public void mul() 
	{
		System.out.println("Method mul==class D");
		
	}
	public static void main(String[] args) 
	{
	
		System.out.println("Main Starts");
		D d=new D();
		d.add();
		d.sub();
		d.mul();
		d.div();
		System.out.println("Main End");
		
		
	}

}
