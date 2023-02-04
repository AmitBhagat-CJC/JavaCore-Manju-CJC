package ab.core.one.set.get.four;

public class Hostel
{
	int year;
	int roomno;
	String sname;
	float sweight;
	
	public Hostel(int year , int roomno, String sname,float sweight)
	{
		this.year=year;
		this.roomno=roomno;
		this.sname=sname;
		this.sweight=sweight;
		
	}
	@Override
	public String toString()
	{
		return "Hostel[year="+year+",roomno="+roomno+",sname="+sname+",sweight="+sweight+"]";
	}

}
