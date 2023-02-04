package Itertor_ForEachLoop_4;

import java.util.ArrayList;
import java.util.List;

public class Q5 
{

	public static void main(String[] args) 
	{
		List<String>mh=new ArrayList<>();
			mh.add("Pune");
			mh.add("Mumbai");
		List<String>jh=new ArrayList<>();
			jh.add("Ranchi");
			jh.add("Lohardaga");
		List<List<String>>india=new ArrayList<>();		
			india.add(mh);
			india.add(jh);
		List<String>al=new ArrayList<>();
			al.add("NewYork");
			al.add("LosAngel");
		List<String>cl=new ArrayList<>();
			cl.add("Chicago");
			cl.add("Houston");
		List<List<String>>usa=new ArrayList<>();		
			usa.add(al);
			usa.add(cl);
		List<List<List<String>>>world=new ArrayList<>();
			world.add(india);
			world.add(usa);
					
					for(List<List<String>> list:world)
					{
						for(List<String> states:list)
						{
						
							for(String city:states)
							{
							System.out.println(city);
						}
					}
	
				}

	}
}
