package with.constructor;

public class Client 
{
	private int cid;
	private String cname;
	private String caddress;
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	
	public String getCname() 
	{
		return cname;
	}
	public void setCname(String cname)
	{
		this.cname=cname;
	}
	@Override
	public String toString() {
		return "Client [cid=" + cid + ", cname=" + cname + ", caddress=" + caddress + "]";
	}
	public Client(int cid, String cname, String caddress) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.caddress = caddress;
	}
	
//	@Override
//	public String toString()
//	{
//		return "Client[cid="+cid+",cname="+cname+",caddress="+caddress+"]";
//	}
//
//	public Client(int cid,String cname,String caddress)
//	{
//		super();
//		this.cid=cid;
//		this.cname=cname;
//		this.caddress=caddress;
//	}
//	
	

}
