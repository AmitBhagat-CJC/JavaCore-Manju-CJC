
public class StaticArea 
{
	static int x=10;
	int y=20;
		
	public static void m1()
	{
	
	}
	public static void m2()
	{
			
	}
	public static void main(String[] args) 
	{ 
		// 1. by using object creation
		/* StaticArea a=new StaticArea();
		System.out.println(a.x);
		a.m1();
		System.out.println(a.y);
		a.m2(); */
	
		//2. by using class name
		/*System.out.println(StaticArea.x);
		StaticArea.m1();*/
		
		/*System.out.println(StaticArea.y); ==>Error
		StaticArea.m2();  					==>Error */
		
		//3.by using class name
		/*System.out.println(x);
				m1(); */
		
		/* System.out.println(y);   ==>Error
				m2();				==>Error 
				
		}
} 



