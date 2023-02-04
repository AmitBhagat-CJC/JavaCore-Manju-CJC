package Throws;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class B 
{
	public void m1()
	{
		m2();
	} 	
	public void m2()
	{ 
		try 
		{
		m3();	 	
		} 	
		catch(FileNotFoundException e)
		{
			System.out.println("catch");
		}
	}
		
	public void m3()throws FileNotFoundException
	{
		FileReader f=new FileReader ("abc.txt");
	} 	
	public static void main(String[] args) 
	{ 		
		B b=new B(); 		
		b.m1();
	}
		
}
