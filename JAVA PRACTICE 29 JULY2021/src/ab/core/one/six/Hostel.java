package ab.core.one.six;

public class Hostel 
{
	int year;
	long roomno;
	String sname;
	float sweight;
	
	
	
	public int getYear() {
		return year;
	}



	public void setYear(int year) {
		this.year = year;
	}



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



	@Override
	public String toString() {
		return "Hostel [year=" + year + ", roomno=" + roomno + ", sname=" + sname + ", sweight=" + sweight + "]";
	}
	


	

}
