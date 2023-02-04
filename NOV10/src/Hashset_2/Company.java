package Hashset_2;

import java.util.ArrayList;

import java.util.*;
import java.util.List;
import java.util.Scanner;


public class Company 
{
    public List designation()
    {       //set all employee data and add it into the generic set and then list here 
    	
    	List team=new ArrayList();
    	
    	Set developer=new HashSet(); 
    	
    	Employee e1=new Employee();
    	e1.setEid(202);
    	e1.setEname("Tom");
    	e1.setEsalary(5000);
    	   	
    	
    	Employee e2=new Employee();
    	e2.setEid(505);
    	e2.setEname("Jerry");
        e2.setEsalary(8000);
    	   	   	         
    	  	    	
    	Set tester=new HashSet();
    	Employee e3=new Employee();
    	e3.setEid(905);
    	e3.setEname("anth");
       	e3.setEsalary(4000);
    	
    	
    	Employee e4=new Employee();
    	e4.setEid(506);
    	e4.setEname("Kasubh");
    	e4.setEsalary(25000);
    	
    	
    	
															//set employee data here and add it into list.


			System.out.println("Enter your emp_desig");
			Scanner sc;
			String empdesig=sc.next();
			e1.setEname(ename);
						
			Employee e2=new Employee();
			System.out.println("Enter your emp_id:");
			int emid=sc.nextInt();
			e2.setEmpid(empid);
			
			System.out.println("Enter Your emp_name:");
			String emname=sc.next();
			e2.setEmpname(empname);
			
			System.out.println("Enter your emp_desig");
			String emdesig=sc.next();
			e2.setEmpdesig(empdesig);
			
			System.out.println("Enter yor salary");
			Double emsalary=sc.nextDouble();
			e2.setEmpsalary(empsalary);
			
			details.add(e1);
			details.add(e2);
				
			return details;
	}       	
}
