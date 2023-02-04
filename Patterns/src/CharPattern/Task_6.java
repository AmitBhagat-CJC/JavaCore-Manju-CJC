package CharPattern;

public class Task_6 
{

	public static void main(String[] args) 
	{
		
		System.out.println("\n\n");
		int n=6;
		for(int i=6;i<=n;i++)
		{
			for(int j=1;j<=n+-1;j++)  // ====> put j<=i  for new pattern
			{								//j<=n-+0
				System.out.print((char)('A'+(j-1)) +" ");
			}
			System.out.println();
			for(int j=1;j<=n-+2;j++)
			{
				System.out.print((char)('B'+(j-1)) +" ");
			}
			System.out.println();
			for(int j=1;j<=n-+3;j++)
			{
				System.out.print((char)('C'+(j-1)) +" ");
			}
			System.out.println();
			for(int j=1;j<=n-+4;j++)
			{
				System.out.print((char)('D'+(j-1)) +" ");
			}
			
			System.out.println();
			for(int j=1;j<=n-+5;j++)
			{
				System.out.print((char)('E'+(j-1)) +" ");
			}
			System.out.println();
			
		}
			

		

	}
			

}

		


