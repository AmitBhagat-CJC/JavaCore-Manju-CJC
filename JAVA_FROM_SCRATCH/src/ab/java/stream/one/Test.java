package ab.java.stream.one;

class Test
{
		public static void main(String[] args) 
		{
			int a=5;
					
			Square s=(int x) ->x*x;
			
			int val=s.calculate(a);
			System.out.println(val);
			
		}
	}
