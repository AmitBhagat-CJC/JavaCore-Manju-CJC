package StarPattern;

public class InvertedPyramid 
{

	public static void main(String[] args)
	{
		for(int i=1; i<=4;i++) 
		{
			for(int j=1; j<=i;i++) 
			{
				System.out.print(" ");
			}
			for(int k=1; k>=i;i--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
