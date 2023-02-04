package ab.core.one.set.get.five;

public class Hostel 
{
	int year;
	int roomno;
	String sname;
	float sweight;
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getRoomno() {
		return roomno;
	}
	public void setRoomno(int roomno) {
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
	@Override
	public String toString() {
		return "Hostel [year=" + year + ", roomno=" + roomno + ", sname=" + sname + ", sweight=" + sweight + "]";
	}
	


}
