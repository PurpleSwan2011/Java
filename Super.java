// Parent class
public class Main {
    public static void main() {
        Dog dog = new Dog();
        dog.displayNames();
        dog.sound();
    }
}
class Animal {
    String name = "Animal";

    void sound() {
        System.out.println("Animals make sounds");
    }
}

// Child class
class Dog extends Animal {
    String name = "Dog";

    // Constructor using super to call parent class constructor
    Dog() {
        super(); // Calls the parent class constructor (implicitly done if not written)
        System.out.println("Dog is created");
    }

    void displayNames() {
        System.out.println("Child class name: " + name);
        System.out.println("Parent class name: " + super.name); // Access parent class variable
    }

    @Override
    void sound() {
        super.sound(); // Calls the parent class method
        System.out.println("Dogs bark");
    }
}
