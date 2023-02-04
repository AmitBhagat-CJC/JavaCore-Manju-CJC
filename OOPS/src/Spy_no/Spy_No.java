package Spy_no;

import java.util.Scanner;

public class Spy_No 
{
	public static void main(String[] args) 
	{
		int num,rem,product=1,sum=0,temp; 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number");
		num=sc.nextInt();
		temp=num;
		while(temp!=0)
		{
			rem=temp%10;
			sum=sum+rem;
			product=product+rem;
			temp=temp/10;
		}
		if (sum==product)
		{
			System.out.println("Number is not a Spy Number");
		}
		else
		{
			System.out.println("Number is  Spy Number");
		}
					
		}
	}


