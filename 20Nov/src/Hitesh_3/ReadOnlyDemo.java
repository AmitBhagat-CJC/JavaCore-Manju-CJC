package Hitesh_3;

import java.util.*;

public class ReadOnlyDemo 
{
	
	//how to amke read only
	
	public static List<String> getList()
	{
		List<String>items=new ArrayList<>();
		
		items.add("Banana");
		items.add("Strawberry");
		items.add("Apple");
		items.add("Grapes");
		
		List<String>readOnlyList=Collections.unmodifiableList(items);
		
		return readOnlyList;
		
	}
	

}
