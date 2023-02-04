package ab.com.string.one;

public class Palindrom 
{
	public static void main(String[] args) 
	{
		String s="MADAM";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
		if(s.equals(rev))
		{
			System.out.println("Paliindrom no");
		}
		else
		{
			System.out.println("not a  paliindrom");
		}

	}
	
	
}

