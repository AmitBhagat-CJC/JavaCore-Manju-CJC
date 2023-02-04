package com.braindata.bankmanagement.serviceImpl;

import com.braindata.bankmanagement.model.Account;
import com.braindata.bankmanagement.service.*;
import java.io.PrintStream;
import java.util.Scanner;

public class Sbi implements Rbi 
{   //implements all methods here
	Scanner sc = new Scanner(System.in);
	Account bank=new Account();
		
		public void createAccount()
		{
			System.out.println("Account No");
			int accoNo=sc.nextInt();
			bank.setAccNo(accoNo);
			
			System.out.println("Account holder name");
			String name=sc.next();
			bank.setName(name);
			
			System.out.println("mobileNo");
			String mob=sc.next();
			bank.setMobNo(mob);
			
			System.out.println("adharNo");
			String adhr=sc.next();
			bank.setAdharNo(adhr);
			
			System.out.println("age");
			int ag=sc.nextInt();
			bank.setAge(ag);
			
			System.out.println("Balance");
			Double bal=sc.nextDouble();
			bank.setBalance(bal);
			
			System.out.println("Gender");
			String g=sc.next();
			bank.setGender(g);
			
			System.out.println("----------------------------");
			System.out.println("Account Created Sucessfully");
					
		}
		
		public void displayAllDetails()
		{
			System.out.println(bank.getAccNo());
			System.out.println(bank.getName());
			System.out.println(bank.getMobNo());
			System.out.println(bank.getAdharNo());
			System.out.println(bank.getAge());
			System.out.println(bank.getBalance());
			System.out.println(bank.getGender());
		
		}
		public void depositeMoney()
		{
		System.out.println("Enter amount to deposit");
		double d=sc.nextDouble();
	    double total = 	bank.getBalance()+d; 
	    bank.setBalance(total );
	  	System.out.println("deposite Sucessfully");
	  
		}
		public void withdrawal()
		{
			System.out.println("Enter amount to Withdraw");
			double d=sc.nextDouble();
		    double total = 	bank.getBalance()-d; 
		    bank.setBalance(total );
		  	System.out.println(" Sucessfully withdraw");
		}
		public void balanceCheck()
		{
			System.out.println(bank.getBalance());
		}
	}



