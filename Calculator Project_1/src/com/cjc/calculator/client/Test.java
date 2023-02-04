package com.cjc.calculator.client;


import com.cjc.calculator.serviceImpl.Operation;
import java.io.PrintStream;
import java.util.Scanner;

public class Test 
{
	public Test()
    {
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.println("-----------------");
            System.out.println("Enter 1 for Add.. ");
            System.out.println("Enter 2 for Sub.. ");
            System.out.println("Enter 3 for Mul.. ");
            System.out.println("Enter 4 for Div.. ");
            System.out.println("Enter 5 for Exit");
            int x = sc.nextInt();
            Operation o = new Operation();
            switch(x)
            {
            case 1: // '\001'
                System.out.println(" for Addition ");
                o.add();
                break;

            case 2: // '\002'
                System.out.println(" for Substraction ");
                o.sub();
                break;

            case 3: // '\003'
                System.out.println(" for Multiplication ");
                o.mul();
                break;

            case 4: // '\004'
                System.out.println(" for Division ");
                o.div();
                break;

            case 5: // '\005'
                System.out.println("Exit");
                System.exit(0);
                break;
            }
        } while(true);
    }

}
