package Itertor_ForEachLoop_1;


import java.util.*;

public class A 
{

	public static void main(String[] args) 
	{
		List<String>mh=new ArrayList<>();
				mh.add("Pune");
				mh.add("Mumbai");
				
		List<String>jh=new ArrayList<>();
				mh.add("Ranchi");
				mh.add("Lohardaga");
				
		List<List<String>>india=new ArrayList<>();		
				india.add(mh);
				india.add(jh);
		
		//System.out.println(india);
		
				for(List<String>list:india)
				{
					for(String city:list)
					{
						System.out.println(city);
					}
				}
	
	
	}

}
/*import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set; */


