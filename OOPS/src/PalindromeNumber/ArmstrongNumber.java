package PalindromeNumber;

public class ArmstrongNumber 
{
	public static void main(String args[])
	{
	int n,temp,sum=0;
	n=152;
	temp=n;
	while(temp!=0)
	{
	int rem=temp%10;
	sum=sum+(rem*rem*rem);
	temp=temp/10;
	}
	if(sum==n)
	{
	System.out.println(n+"number is armstrong no.");
	}
	else
	{
	System.out.println(n+"number is not armstrong no.");
	}
}
}
