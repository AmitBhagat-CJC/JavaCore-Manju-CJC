package PreparedStatement_CRUD_PROJECT_1;

import java.util.Scanner;

public class Test 
{
		public static void main(String[] args) throws Exception 
		{
			Service s = new Service();
			while(true)
			{
				Scanner sc = new Scanner(System.in);
				
				System.out.print("Enter your choice: ");
				int a=sc.nextInt();
				
				
					switch (a) 
					{
					case 1:
						s.addData();
						break;

					case 2:
						s.deleteData();
						
						break;

					case 3:
						s.updateData();
						
						break;

					case 4:
						s.retriveData();
						
						break;
					case 5:
						System.exit(0);

					default:
						break;
					}
				
				
				}
			}
		}
		

