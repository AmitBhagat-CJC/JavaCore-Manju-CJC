package HashMap_1;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapDemo_3 
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
		
	Map<String,List<String>>india=new HashMap<>();
		india.put("Maharashtra", mh);
		india.put("Jharkhand", jh);
		
	Set<String>keys=india.keySet();
		for(String key:keys)
		{
			System.out.println(key);
			List<String>list=india.get(key);
			for (String city:list)
			{
				System.out.println(city);
			}
		}
	}

}
