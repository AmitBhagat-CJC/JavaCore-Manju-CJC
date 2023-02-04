package instanceof_8;

import java.util.Iterator;

import java.util.*;
public class Uni 
{
	public static void main(String[] args) 
	{
		College c=new College(); 
		
		List data=c.m1();
		
		// get your data using Iterator here
		
		Iterator  itr=data.iterator();
		while(itr.hasNext())
		{
			Student stu=(Student)itr.next();
			System.out.println(stu.getRollno());
			System.out.println(stu.getName());
		}
	       	
	} 
		
}


