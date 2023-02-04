package NumberPattern;

public class PyramidDescends 
{
	public static void main(String[] args) 
	{
				
		for(int i=5;i>=1;i--)
		{
			int no=6;
			for(int j=no;j>=i;j--)
			 {
				System.out.print(no+" ");
				no=no+5-j;
			 }
			for(int k=1;k<=i;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	
	}

}
