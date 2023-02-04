package if_Else_if;

public class Test3 {
	public static void main(String[] args) 
	{
		int x = 20;
		int y = 50;
		 
		if (x>0 && x>y) 
		{
		 System.out.println("Yes, "+x+"is greater than 0 and +50");
		} 
		/* else if (x<y) 
		{
		 System.out.println("Yes, "+y+"is greater than "+x+"");
		}  */
	     else if (y<50 || y!=x)
		{ // || OR Operator , && operator
		 System.out.println("Y is less than"+x);
		} 
		/* else
		 {
			 System.out.println("Both numbers are non zero" ); 
		}*/
		
}
}
