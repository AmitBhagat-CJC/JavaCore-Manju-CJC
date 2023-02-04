package PalindromeNumber;

public class Firstandlast {
	
public static void main (String args[])
{
	int val1,val2;
	int num=125788;
	val1=num;
	while(val1>=10)
	{
		val1=val1/10;
	}
	val2=num%10;
	int count=val1+val2;
	System.out.println(count);
	}
}

