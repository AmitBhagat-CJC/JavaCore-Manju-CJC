package javatpoiint.intro.single.respo;

public class Dog extends Animal {  
    public void woof() {  
        System.out.println("Dog Woof! ");  
    }  
    public static void main(String[] args) {
        Dog obj1 = new Dog();  
        obj1.eatFood();  
        obj1.woof();  
          
        Cat obj2 = new Cat();  
        obj2.eatFood();  
        obj2.meow(); 
}  
}