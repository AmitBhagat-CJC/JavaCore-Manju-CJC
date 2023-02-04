package Comparable_NaturalSort_Employee;
//Q7. Write the program to sort employee class object by using natural sorting.
//i) Sort by id ii) Sort by name iii) Sort by salary

public class Employee implements Comparable<Employee>
{
	private int emid;
	private String emname; 
	private double salary;
	
	//setter/getter
	
	
	public int getEmid() {
		return emid;
	}
	public void setEmid(int emid) {
		this.emid = emid;
	}
	public String getEmname() {
		return emname;
	}
	public void setEmname(String emname) {
		this.emname = emname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	} 

	@Override
	public int compareTo(Employee emp)
	{
		//return this.getEmid()-emp.getEmid();
		//return this.getEmname().compareTo(emp.getEmname());
		return (int) (this.getSalary()-emp.getSalary());
	}
	
	
}
