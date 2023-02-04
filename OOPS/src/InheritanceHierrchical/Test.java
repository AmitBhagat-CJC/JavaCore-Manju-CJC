package InheritanceHierrchical;

public class Test  {
	public static void main(String[]args)
	{
	Karvenagar kng=new Karvenagar();
	kng.setRollno(1);
	kng.setSname("JAI");
	kng.setCname("JAVA");
	kng.setRegularbatch("B125");

	Akurdi akd=new Akurdi();
	akd.setRollno(2);
	akd.setSname("VIRU");
	akd.setCname("PYTHON");
	akd.setWeekendbatch("B80");

	System.out.println(kng.getRollno());
	System.out.println(kng.getSname());
	System.out.println(kng.getCname());
	System.out.println(kng.getRegularbatch());
	System.out.println(akd.getRollno());
	System.out.println(akd.getSname());
	System.out.println(akd.getCname());
	System.out.println(akd.getWeekendbatch());
	}
}
