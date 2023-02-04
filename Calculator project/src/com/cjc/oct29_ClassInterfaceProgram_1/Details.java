package com.cjc.oct29_ClassInterfaceProgram_1;

public class Details implements PersonDetails, StudentDetails
{

	public void name()
	{
		System.out.println("Name==Ram");
	}
	
	public  void rollNo()
	{
		System.out.println("rollno==21");
	}
	
	public  void stuname()
	{
		System.out.println("Ram==stuname");
	}
	
	public static void main(String[] args) 
		{
			Details d = new Details();
			d.name();
			d.rollNo();
			d.stuname();
			
		}
}
