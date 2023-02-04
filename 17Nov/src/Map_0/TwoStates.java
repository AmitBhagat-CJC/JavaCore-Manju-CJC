package Map_0;
import java.util.*;

import java.util.ArrayList;
import java.util.List;

public class TwoStates 
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
