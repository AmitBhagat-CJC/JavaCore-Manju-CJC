package setusingconstructor.getusingtostring;

public class Hostel
{
	long roomno;
	String studentname;
	float studentweight;
	int year;
	
	public Hostel(long roomno, String studentname,float studentweight,int year )
	{
		super();
		this.roomno= roomno;
		this.studentname=studentname;
		this.studentweight=studentweight;
		this.year=year;
	}

	@Override
	public String toString() {
		return "Hostel [roomno=" + roomno + ", studentname=" + studentname + ", studentweight=" + studentweight
				+ ", year=" + year + "]";
	}
	

}
