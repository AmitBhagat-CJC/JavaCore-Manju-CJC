package NumberPattern;

public class PyramidDescending 
{
	public static void main(String[] args) 
	{
		int rows=5;
		
		for(int i=1;i<=rows;i++) //==> loop for rows
		{
			for(int j=rows;j>=i;j--) //==>loop for space
			 {
				System.out.print(" "); //==> print space
			}
			for(int k=1;k<=i;k++)   //==> loop for no
			{
				System.out.print(k+" "); // ==> print no
			}
			System.out.println();
		}
	
	}
}
