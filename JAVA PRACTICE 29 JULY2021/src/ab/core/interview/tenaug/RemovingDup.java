package ab.core.interview.tenaug;

public class RemovingDup
{
	public static  String  removeDup( String  str) 
    {
        String dup = "";
        for (int i = 0; i < str.length(); i++)
            if (!dup.contains("" + str.charAt(i)))
            	dup += "" + str.charAt(i);
        return dup;
    }
public static void main(String[] args) 
{

    String dup = removeDup("MADAM");
    System.out.println(dup); // ABC
}
}
