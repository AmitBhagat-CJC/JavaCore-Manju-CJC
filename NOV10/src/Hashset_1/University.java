package Hashset_1;

import java.util.Iterator;
import java.util.List;
import java.util.*;
public class University 
{

	public static void main(String[] args) 
	{
        //get all student data using iterator here    
		College c=new College(); 
		Set x=c.m1();
		
		// get your data using Iterator here
		
		Iterator itr=x.iterator();
		while(itr.hasNext())
		{
			Student stu=(Student)itr.next();
			System.out.println(stu.getRollno());
			System.out.println(stu.getName());
		}
	
	
	
	
	} 
		
}


