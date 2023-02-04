package Oct11_3;

public class Hostel12 
{
	
	private long roomno;
	private String sname;
	private float sweight;
	private int year;
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
	
	
	@Override
	public String toString() {
		return "Hostel2 [roomno=" + roomno + ", sname=" + sname + ", sweight=" + sweight + ", year=" + year
				+ ", getRoomno()=" + getRoomno() + ", getSname()=" + getSname() + ", getSweight()=" + getSweight()
				+ ", getYear()=" + getYear() + "]";
	}
	
			
	
	

	

}
