package ab.core.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Duplicate 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer>al=new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,5,6,6,7));
		List<Integer>ala=al.stream().distinct().collect(Collectors.toList());
		System.out.println(ala);
	}
	

}
