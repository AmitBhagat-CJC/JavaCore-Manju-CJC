package superthis;

public class B extends A
{
		public B()
		{
			this("xyz");
			System.out.println("Constructor==B");
		}
		public B(int i)
		{
			super();
			System.out.println("Constructor==B");
		}
		public B(String s)
		{ 
		    this(4);
			System.out.println("Constructor==B");
			
		}
}
