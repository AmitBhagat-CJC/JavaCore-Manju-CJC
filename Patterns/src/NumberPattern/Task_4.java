package NumberPattern;

public class Task_4 {

		public static void main(String[] args) 
		{
						
			for(int i=1;i<=5;i++) //==> loop for rows
			{
				for(int j=i;j<=5;j++) //==>loop for space
				 {
					System.out.print(j+" "); //==> print space
				}
				for(int k=1;k<=i;k++)   //==> loop for no
				{
					System.out.print(k+" "); // ==> print no
				}
				System.out.println();
			}
		
		}
		

	}

