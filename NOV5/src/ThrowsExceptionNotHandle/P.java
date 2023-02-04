package ThrowsExceptionNotHandle;

import java.io.FileNotFoundException;
import java.io.FileReader;

import Throws.A;

public class P    //throws exception handle nahi karta.. Handover / Prapogate karta hai
{					// throws keyword exception ko delegate karta hai 
	public void m1()throws FileNotFoundException
	{
		try 
		{
			m2();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("catch");
		}
		
	} 	
	public void m2()throws FileNotFoundException
	{ 	
		m3();
			 	
	} 	
	public void m3()throws FileNotFoundException
	{
		FileReader f=new FileReader ("abc.txt");
	} 	
	
	public static void main(String[] args) throws FileNotFoundException
	{ 		
		P p=new P(); 		
		p.m1();
	}

}
