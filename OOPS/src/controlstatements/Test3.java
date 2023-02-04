package controlstatements;

public class Test3
{
public static void main(String []args)
{
int x=270;
int y=550;
	if(y<0)//outer if
	{
	System.out.println("Yes"+x+"is greater than 0 and +y");
	
		if(x==270)
		{
		System.out.println("Yes"+x+"is equalto 550");
		}
		else
		{
		
		System.out.println("Yes"+x+"is not equalto 550");
		}
	}
	else
	{
	System.out.println("No"+x+"is greater than 0 and +y");
	}
}
}
