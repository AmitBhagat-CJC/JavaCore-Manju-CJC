




public class Test extends Thread 
{
	public void run() 
	{
		try 
		{
			for (int i = 0; i <= 5; i++) 
			{
				System.out.println("child Thread:"+i);
				
			}
			
		} catch (Exception e)
		{
			System.out.println(e);
		}
		
	}
	public static void main(String[] args) throws InterruptedException 
	{
		Test t=new Test();
		t.start();
		t.join();
		
		try 
		{
			for (int i = 0; i <= 5; i++) 
			{
				System.out.println("Main Thread:"+i);
				Thread.sleep(3000);
			}
			
		} catch (Exception e)
		{
			System.out.println(e);
		}
		
	}

}

