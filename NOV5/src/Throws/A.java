package Throws;

import java.io.FileNotFoundException;
import java.io.FileReader;
						
public class A 			// Exception handover to other methods in any sequence
{						//  and finally handover to JVM. 
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
		A a=new A(); 		
		a.m1();
	}
} 

	

