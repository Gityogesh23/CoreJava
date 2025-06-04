//in java multiple inheritance cannot be achieved by using classes ,can achieve using Interface

 interface Interface_A {
    // Abstract method
    void show();

    // Default method
    default void greet() {
        System.out.println("Hello from InterfaceA");
    }

    // Static method
    static void staticGreet() {
        System.out.println("Static greet from InterfaceA");
    }
}

interface Interface_B {
    // Abstract method
    void display();

    // Default method with same name as in InterfaceA
    default void greet() {
        System.out.println("Hello from InterfaceB");
    }

    // Static method
    static void staticGreet() {
        System.out.println("Static greet from InterfaceB");
    }
}

// Class implementing multiple interfaces
public class MultipleInheritanceDemo implements Interface_A, Interface_B {

    // Implement abstract methods
    public void show() {
        System.out.println("Showing from MultipleInheritanceDemo");
    }

    public void display() {
        System.out.println("Displaying from MultipleInheritanceDemo");
    }

    // Override default greet() method to resolve conflict
    @Override
    public void greet() {
        // We can choose which default method to call:
        Interface_A.super.greet(); // or InterfaceB.super.greet();
    }

    public static void main(String[] args) {
        MultipleInheritanceDemo obj = new MultipleInheritanceDemo();

        obj.show();           // Abstract from InterfaceA
        obj.display();        // Abstract from InterfaceB
        obj.greet();          // Overridden greet()

        // Calling static methods from interfaces
        Interface_A.staticGreet();
        Interface_B.staticGreet();
    }
}

