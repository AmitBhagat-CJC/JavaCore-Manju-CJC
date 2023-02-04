package com.braindata.bankmanagement.client;

import java.io.PrintStream;
import java.util.Scanner;
import com.braindata.bankmanagement.service.Rbi;
import com.braindata.bankmanagement.serviceImpl.Sbi;


public class Test 
{
	public static void main(String[] args)
	{		//Display proper msg for calling methods.
		Scanner sc = new Scanner(System.in);
		Rbi bank=new Sbi();
		
        do
        {
            System.out.println("----------------------------------");
            System.out.println("Enter 1 for createAccount ");
            System.out.println("Enter 2 for displayAllDetails ");
            System.out.println("Enter 3 for depositeMoney");
            System.out.println("Enter 4 for withdrawal");
            System.out.println("Enter 5 for balance check");
            System.out.println("Enter 6 for Exit");
            System.out.println("----------------------------------");
            int x = sc.nextInt();
                              //As per user choice perform bank operation using switch case
		switch(x)
		{						//only call Sbi methods here
		case 1: // '\001'
            bank.createAccount();
            break;

		case 2: // '\001'
			bank.displayAllDetails();
            break;

        case 3: // '\001'
            bank.depositeMoney();
            break;

		case 4: // '\001'
            bank.withdrawal();
            break;

		case 5: // '\001'
            bank.balanceCheck();
            break;
            
		case 6: // '\001'
			System.out.println("Thank You");
			System.exit(0);
		            
        default :
        	System.out.println("please enter correct input");
           
                       	
        }
	
        }while(true);
	}
}
