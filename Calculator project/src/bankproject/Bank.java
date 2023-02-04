package bankproject;

class bank
{
	int ac_no; 
	String name, type;

	float amount;

	void details (int n, String nm, String t, float a) 

	{

		ac_no=n;

		name=nm;

		type=t;

		amount=a;

	}

	void show() 

{

System. out. println(ac_no+" "+name+" "+type+" "+amount) ;

}

void deposit (float a) 

{amount =amount+a;

System.out.println(" Deposit amount:"+a) ;

}

void withdraw (float a) 

{ if(amount<a) 

System.out.println("Balance is insufficient ");

else{

amount=amount-a;

System.out.println("Withdraw amount:"+a) ;

}

}

void checkbalance() 

{

System.out.println("Balance is:"+amount);

}

}

