package Hitesh_2;

import java.util.ArrayList;
import java.util.List;

public class Person 
{
	private String name;
	private String address;
	private List<String> Vehicle=new ArrayList<String>();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<String> getVehicle() {
		return Vehicle;
	}
	public void setVehicle(List<String> vehicle) {
		Vehicle = vehicle;
	}
	
	
	

}
