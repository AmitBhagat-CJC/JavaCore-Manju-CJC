package Hitesh_3;
import java.util.*;
import java.util.List;

public class Test 
{

	public static void main(String[] args) 
	{
		
		List<String> list=ReadOnlyDemo.getList();
		try 
		{
			list.add("Orange");
		}
		
		catch(Exception e)
		{
		System.out.println("We cant update");
		}
		System.out.println(list);
		

	}

}
