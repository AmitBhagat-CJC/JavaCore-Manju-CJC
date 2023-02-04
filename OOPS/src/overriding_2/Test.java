package overriding_2;

public class Test {
	public static void main(String[] args)
	{    
		Parent p = new Parent();  
		p.diplay();   
		//p.m1();     
		p.m2();   
		p.m3();  
		
		Parent p1 = new Child();      
		p1.diplay();    
		//p1.m1();   
		p1.m2();    
		p1.m3();     
	}  
}
