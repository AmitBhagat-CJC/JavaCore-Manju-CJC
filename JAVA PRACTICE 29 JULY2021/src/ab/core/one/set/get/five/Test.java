package ab.core.one.set.get.five;

public class Test 
{
	public static void main(String[] args) {
		
		Hostel h=new Hostel();
		h.setYear(2021);
		h.setRoomno(101);
		h.setSname("amit");
		h.setSweight(68.2f);
		
		Hostel h1=new Hostel();
		h1.setYear(2022);
		h1.setRoomno(102);
		h1.setSname("narsi");
		h1.setSweight(78.2f);
		
		Hostel h2=new Hostel();
		h2.setYear(2023);
		h2.setRoomno(103);
		h2.setSname("jivan");
		h2.setSweight(48.2f);
		
		Hostel h3=new Hostel();
		h3.setYear(2024);
		h3.setRoomno(1054);
		h3.setSname("suprem");
		h3.setSweight(58.2f);
		
		
		
		System.out.println(h);
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
	}

}
