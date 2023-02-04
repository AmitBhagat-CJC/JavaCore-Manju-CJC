package ThrowsExceptionNotHandle;



public class B3  
	{ 	
		public void m2() throws ClassNotFoundException 
		{ 		
			System.out.println("B3_________m2 Start"); 		//3
			Class.forName("A"); 		
			System.out.println("B3_________m2 End"); 	
		} 
	} 



