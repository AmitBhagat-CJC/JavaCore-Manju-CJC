package CharPattern;

public class Task_4 
{
	public static void main(String[] args) 
	{
		System.out.println("\n\n");  // to skip 2 line 
		
		for(char i='A';i<='E';i++)
		{
			
			for(char j=i;j>='A';j--)
			{
				System.out.print(j);
			}
			System.out.println();
		} 
		
	}

}
