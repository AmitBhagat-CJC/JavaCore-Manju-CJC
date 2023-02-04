package superthis4;

public class Animal {
	   String name; 
	   Animal(String name) {
	      this.name = name;
	   } 
	   public void move() {
	      System.out.println("Animals can move");
	   }
	   public void show() {
	      System.out.println(name);
	   }
	}
