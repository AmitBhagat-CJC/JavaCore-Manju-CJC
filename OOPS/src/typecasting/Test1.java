package typecasting;

//convert double =d into int,long,float

public class Test1 
{
		public static void main(String[] args) 
		{
			double d = 10.99d;
			int x = (int) d;
			long y= (long) d;
			float z= (float) d; 
		
			System.out.println(x);
			System.out.println(y);
			System.out.println(z);
		}
}
