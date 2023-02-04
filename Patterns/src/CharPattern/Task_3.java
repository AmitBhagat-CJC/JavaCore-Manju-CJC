package CharPattern;

public class Task_3 {

	public static void main(String[] args) 
	{
		System.out.println("\n\n");
		for(char i='A';i<='E';i++)
		{
			
			for(char j='A';j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		} 
		System.out.println("\n\n");
		for(char i='E';i<='A';i--)
		{
			
			for(char j=i;j>='A';j--)
			{
				System.out.print(j);
			}
			System.out.println();
		} 

	}

}
