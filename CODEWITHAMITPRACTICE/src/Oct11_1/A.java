package Oct11_1;


			public class A
			{
				int x;
				public void sum()
				{
					
					System.out.println("x");
				}

	
		public static void main(String[] args)
		{
			System.out.println("Main Start");//1
			
			A a=new A();
//			a.sum();
			a.x=100;		//2
			
			A a1=new A();
//			a1.sum();
			a1.x=200;		//3
			
			A a2=new A();
//			a2.sum();
			a2.x=300;		//3

			A a3=new A();
//			a3.sum();
			a3.x=400;		//4
			
			System.out.println("Main End");		//5
			
		}
		
}

