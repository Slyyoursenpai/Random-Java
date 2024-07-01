package oop;

// Define an interface for basic animal behaviors
interface Animal {
    void makeSound();
    void eat();
}

// Abstract class implementing the Animal interface
abstract class Mammal implements Animal {
    private String name;

    public Mammal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Abstract method to be implemented by subclasses
    public abstract void move();
}

// Subclass Dog extending Mammal
class Dog extends Mammal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void move() {
        System.out.println("Dog is running");
    }
}
// Main class to test the program
public class Main {
    public static void main(String[] args) {
        // Using polymorphism to create Animal objects
        Animal myDog = new Dog("Buddy");
        Mammal myDog2 = new Dog("Bolt");

        // Calling methods on the Animal objects
        myDog.makeSound();
        myDog.eat();
        ((Mammal) myDog).move(); // Type casting to Mammal to call move()
        System.out.println("Animal name is: " + ((Mammal) myDog).getName());
        
        myDog2.makeSound();
        myDog2.eat();
        System.out.println("Animal name is: " + myDog2.getName());
    }
}
