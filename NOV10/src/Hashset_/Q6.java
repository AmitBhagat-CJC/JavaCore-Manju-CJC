package Hashset_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Q6. what will be the output? 	
public class Q6 
{

	public static void main(String[] args)
	{
		
//		List list=new ArrayList();
//		
//		list.add("aaAA"); 		//4    97   97 	
//		list.add("AaA"); 		//2    65   97 	
//		list.add("aAAa"); 		//3    97   65 	
//		list.add("AAaa"); 		//1    65   65 	
//		
//		Collections.sort(list);	
//		System.out.println(list); 
		

//	}
//
//}


List al=new ArrayList();

al.add("aaAA"); 	//4    97   97 	
al.add("AaA"); 		//2    65   97 	
al.add("aAAa"); 	//3    97   65 	
al.add("AAaa"); 	//1    65   65 	

Collections.sort(al);	
System.out.println(al); 
}
}