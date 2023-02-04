package ab.core.collection.one;


import java.util.Hashtable;

public class Q4 
{
	public static void main(String[] args) {
		Hashtable<Integer,String>m=new Hashtable<Integer,String>();
		m.put(1, "amit");
		m.put(02, "Ravi");
		m.put(3, "Ranjan");
		m.put(4, "Kunal");
		
		System.out.println(m.getOrDefault(2, "Not Found")+"");
		System.out.println(m.getOrDefault(5, "Not Found"));
		
	}
	
	

}
