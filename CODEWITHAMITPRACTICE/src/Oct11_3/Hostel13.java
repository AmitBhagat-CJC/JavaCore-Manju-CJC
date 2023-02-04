package Oct11_3;

public class Hostel13 
{
	long roomno;
	String sname;
	Float sweight;
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
	public Float getSweight() {
		return sweight;
	}
	public void setSweight(Float sweight) {
		this.sweight = sweight;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "roomno=" + roomno + ", sname=" + sname + ", sweight=" + sweight + ", year=" + year;
				
	}
	

}
