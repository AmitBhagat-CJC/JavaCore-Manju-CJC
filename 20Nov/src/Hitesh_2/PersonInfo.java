package Hitesh_2;


import java.util.*;

public class PersonInfo 
{

	public static void main(String[] args) 
	{
		Person p1=new Person();
		p1.setName("Amit");
		p1.setAddress("Pune");
		p1.getVehicle().add("BMW");
		p1.getVehicle().add("Land Rover");
		
		Person p2=new Person();
		p2.setName("Ramesh");
		p2.setAddress("Pune");
		p2.getVehicle().add("kia");
		p2.getVehicle().add("Mahindra");
		p2.getVehicle().add("Maruti");
		
		System.out.println(p1.getName());
		System.out.println(p1.getAddress());
		
		List<String>lv1=p1.getVehicle();
		System.out.println("\nVehicle's :  ");
	
				for(String s: lv1)
				{
					System.out.println(s);
				}
				System.out.println("-------------------------------------\n");
				
				System.out.println(p2.getName());
				System.out.println(p2.getAddress());
				
				List<String>lv2=p2.getVehicle();
				System.out.println("\nVehicle's :  ");
				
				for(String s1: lv2)
						{
							System.out.println(s1);
							
						}
			
	}

				

}


