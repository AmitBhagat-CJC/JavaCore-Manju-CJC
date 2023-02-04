package Static_NonStatic;

public class NonStaticArea 
{
	static int x=10;
	int y=20;
		
	public static void m1()
	{
	
	}
	public static void m2()
	{
			
	}
	public void display ()
	{ 
	}
	public static void main(String[] args) 
	{
		
	
		// 1. by using object creation
		NonStaticArea b=new NonStaticArea();
		System.out.println(b.x);
		b.m1();
		System.out.println(b.y);
		b.m2(); 
	
		//2. by using class name
		System.out.println(NonStaticArea.x);
		StaticArea.m1();
//	   	System.out.println(NonStaticArea.y); //==>Error
//		StaticArea.m2();  					//==>Error */ 
		
		//3.by using class name
		System.out.println(x);
				m1(); 
		
//		 System.out.println(y);   ==>Error
//				m2();				==>Error  */
				
		}
} 


	


