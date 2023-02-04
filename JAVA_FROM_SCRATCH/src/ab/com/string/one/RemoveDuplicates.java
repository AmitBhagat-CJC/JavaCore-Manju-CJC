package ab.com.string.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;
public class RemoveDuplicates 
{
	public static void main(String[] args) 
	{
		//1.Using LinkedHashSet
		ArrayList<Integer> number=new ArrayList<Integer>(Arrays.asList(1,2,3,1,2,2,3,4,5,4,4,5,6,7));
		LinkedHashSet<Integer>LinkedHashSet=new LinkedHashSet<>(number);
		ArrayList<Integer> numberWithoutDuplicates=new ArrayList<Integer>(LinkedHashSet);
		System.out.println(numberWithoutDuplicates);
		
		//2.Using Stream API 
		ArrayList<Integer>markList=new ArrayList<Integer>(Arrays.asList(21,22,23,24,21,22,23,24,25));
		List<Integer>markListUnique=markList.stream().distinct().collect(Collectors.toList());
		System.out.println(markListUnique);
		
		//1.Using LinkedHashSet
		ArrayList<String> names=new ArrayList<String>(Arrays.asList("amit","sumit","amit","sumit"));
		LinkedHashSet<String>linkedHashSet2=new LinkedHashSet<>(names);
		ArrayList<String> namesWithoutDuplicates=new ArrayList<String>(linkedHashSet2);
		System.out.println(namesWithoutDuplicates);
				
		//2.Using Stream API 
		ArrayList<String>namesList=new ArrayList<String>(Arrays.asList("kunal","ravi","kunal","ravi"));
		List<String>namesListUnique=namesList.stream().distinct().collect(Collectors.toList());
		System.out.println(namesListUnique);
	}
}
