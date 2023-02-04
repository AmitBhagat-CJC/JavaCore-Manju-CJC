package superthis4;

public class Dog extends Animal {
	Dog() {
	      //Using this to call current class constructor
	      this("Test");
	   } 
	   Dog(String name) {
	      //Using super to invoke parent constructor
	      super(name);  
	   } 
	   public void move() {
	      // invokes the super class method
	      super.move(); 
	      System.out.println("Dogs can walk and run");
	   }
}
