package com.cjc.oct29_ClassInterfaceProgram;

public class Test 
{

	public static void main(String[] args)
	{
		Mysql m=new Mysql();
		m.commit();
		m.rollback();
		
		Oracle o=new Oracle();
		o.commit();
		o.rollback();
		
		Connection con=new Oracle();
		con.commit();
		con.rollback();
		
	//	Connection con=new Mysql();
		//con.commit();
		//con.rollback();
		
		
	}

}
