package narrowingerror;

public class Test2
{     	
	public static void main(String[] args)
	{          		
		System.out.println("Normal main method");
		Test2.main("cjc");      	
		}      	
	public static void main(String arg1)
	{          		
		System.out.println("without array main method: " + arg1);
		Test2.main("cjc", "classes");      	
		}      	
	public static void main(String arg1, String arg2) 
	{          
		System.out.println("two paramerter main method: "+arg1+", "+arg2);      	
		}  
	}