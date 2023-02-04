package setRefVariableGetToString;

public class Hostel 
{
	
	long roomno;
	String studentname;
	float studentweight;
	int year;
	@Override
	public String toString() {
		return "Hostel [roomno=" + roomno + ", studentname=" + studentname + ", studentweight=" + studentweight
				+ ", year=" + year + "]";
	}
	
	public static void main(String[] args) 
	{
		Hostel h=new Hostel();
		h.roomno=1001l;
		h.studentname="Harsh";
		h.studentweight=50f;
		h.year=1984;
		
		System.out.println(h);
		
		
	}

}
