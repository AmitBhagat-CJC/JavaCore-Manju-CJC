package Rvision_M_Mam_Map;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Q1 
{

	public static void main(String[] args) 
	{
		List mh=new ArrayList();
		mh.add("Pune");
		mh.add("Mumbai");
		
		List kt=new ArrayList();
		kt.add("Tumkur");
		kt.add("B'lore");
		
		Map india=new HashMap();
		india.put(1,mh);
		india.put(2,kt);
		//System.out.println(india);
		
		Set<Integer>keys=india.keySet();
		
		for(int key:keys)
		{
			System.out.println(key);
			List<String>list=(List)india.get(key);
			for(String city :list)
			{
				System.out.println(city);
			}
		}
		
	}

}
