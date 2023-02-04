package narrowingerror;

public class Test1 
{
		public void m1(A1 a)
		{ 		
		 System.out.println("In A parameter"); 	
		} 	
		public void m1(B1 b)
		{ 		
		System.out.println("In B parameter"); 	
		} 	
		public void m1(C1 c)
		{ 		
		System.out.println("In C parameter"); 	
		}
		public static void main(String[] args) 
		{ 	
				Test1 t=new Test1 (); 	
				t.m1(null); 	
				t.m1((A1)null); 	
				t.m1((B1)null);    
		}
	}


