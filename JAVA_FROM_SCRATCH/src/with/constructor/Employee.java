package with.constructor;

public class Employee 
{
	private int id;
	private String name;
	private String address;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public String getAddress()
	{
		return address;
	}
	@Override
	public String toString()
	{
		return "Emplpoyee[id="+id+",name="+name+",address="+address+" ]";
	}
	
	public Employee(int id,String name,String address)
	{
		super();
		this.id=id;
		this.name=name;
		this.address=address;
	}

}
