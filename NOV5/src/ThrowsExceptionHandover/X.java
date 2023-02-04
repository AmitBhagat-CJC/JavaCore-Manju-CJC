package ThrowsExceptionHandover;

import java.io.FileNotFoundException;
import java.io.FileReader;

import Throws.A;

public class X          //throws keyword Exception ko Handover / Prapogate karta hai
{
	public void m1()throws FileNotFoundException
	{
		m2();
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
		X x=new X(); 		
		x.m1();
	}

}
