package CharPattern;

public class Task_3_alternate 
{

	public static void main(String[] args) 
	{
		System.out.println("\n\n");
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i+1;j++)   // ====> put j<=i  for new pattern
			{
				System.out.print((char)('A'+(j-1)) +" ");
			}
			System.out.println();
		}
		

	}

}
