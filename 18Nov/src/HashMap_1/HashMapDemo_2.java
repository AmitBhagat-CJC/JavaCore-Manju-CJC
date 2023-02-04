package HashMap_1;
import java.util.*;
import java.util.List;
import java.util.ArrayList;

public class HashMapDemo_2
{

	public static void main(String[] args) 
	{
		List<String>mh=new ArrayList<>();
			mh.add("Pune");
			mh.add("Mumbai");
			mh.add("Nagpur");
		
		List<String>jh=new ArrayList<>();
			jh.add("Ranchi");
			jh.add("Lohardaga");
			jh.add("Gumala");
		
		List<List<String>>india=new ArrayList<>();
			india.add(mh);
			india.add(jh);
			
			for(List<String>list:india)
			{
				for (String city:list)
				{
					System.out.println(city);
				}
			}
	}

}
