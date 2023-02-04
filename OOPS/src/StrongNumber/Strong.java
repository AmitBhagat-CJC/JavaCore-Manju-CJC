package StrongNumber;

public class Strong 
{
	public static void main(String[] args) 
	{
		int num=141,i,fact,rem,total=0,temp=num;
				
				while(num>0)
				{
					i=1;
					fact=1;
					rem=num%10;
					while(i<=rem)
					{fact=fact*i;
					i++;
				}
					total=total+fact;
					num/=10;
		}
		if(total==temp)
		{
			System.out.println(temp+"is a strong no");
		}
		else
		{
			System.out.println(temp+"is not a strong no");
		}
	}
}
		

	


