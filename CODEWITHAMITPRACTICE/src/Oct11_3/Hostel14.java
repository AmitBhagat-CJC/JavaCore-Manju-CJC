package Oct11_3;

public class Hostel14 
{
	long roomno;
	String sname;
	float sweight;
	int year;
	public long getRoomno() {
		return roomno;
	}
	public void setRoomno(long roomno) {
		this.roomno = roomno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public float getSweight() {
		return sweight;
	}
	public void setSweight(float sweight) {
		this.sweight = sweight;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Hostel14(long roomno, String sname, float sweight, int year) 
	{
		//super();
		this.roomno = roomno;
		this.sname = sname;
		this.sweight = sweight;
		this.year = year;
	}
	@Override
	public String toString() {
		return "roomno=" + roomno + ", sname=" + sname + ", sweight=" + sweight + ", year=" + year;
				
	}
	
	
	
	
	

}
