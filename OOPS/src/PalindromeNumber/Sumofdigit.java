package PalindromeNumber;
// WAP to print sum of digit in a given no 

	public class Sumofdigit
	{
		public static void main(String[]args)
		{
			long num=23456789,rem,sum=0;
			while(num>0)
			{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
			
			}
			System.out.println("Sum of digit of no is:"+sum);
		}
		
	}



