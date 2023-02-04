/**
 * 
 */
package com.parameterreturntype;

/**
 * @author Windows
 *
 */
	public class Test16
	{
		public int sum(int x,int y)
		{
			System.out.println("Sum==Method");
			
			int z=x+y;
			
			System.out.println(z);
			
			return z;
		}
		
		public static void main(String []args)
		{
			System.out.println("main==start");
		
			Test16 t=new Test16();
			
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			
			int s=t.sum(a,b);
			
			System.out.println(s);
			System.out.println("Main==End");
		}
	}
		

