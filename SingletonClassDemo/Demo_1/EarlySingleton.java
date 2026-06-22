/*
Imp Points: 
Core Requirements:
To implement a standard singleton class, you must follow three core rules:
1) Private Constructor: Prevents external code from creating new instances via the new operator.
2) Private Static Variable: Holds the single, unique instance of the class.3)Public Static Method: Acts as a global access point (typically named getInstance()) to return the unique instance


*/

// Singleton.java
 class SingletonDemo1 {
    // Step 1: Create a single instance at class loading
    private static final SingletonDemo1 instance = new SingletonDemo1();

    // Step 2: Make constructor private
    private SingletonDemo1() {
        System.out.println("Singleton instance created (Eager)");
    }

    // Step 3: Provide a global access point
    public static SingletonDemo1 getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Eager Singleton!");
    }
}
// Main.java
 public class EarlySingleton {
    public static void main(String[] args) {
        SingletonDemo1 obj1 = SingletonDemo1.getInstance();
        SingletonDemo1 obj2 = SingletonDemo1.getInstance();

        obj1.showMessage();

        System.out.println("Are both objects same? " + (obj1 == obj2)); // true
        }
    }
/*
Key Takeaways
The Singleton pattern ensures a class has exactly one instance per JVM and provides a global access point to it.
Java offers seven common Singleton implementations: eager, static block, lazy, synchronized method, double-checked locking, Bill Pugh, and enum.
Bill Pugh (initialization-on-demand holder) is the recommended implementation when lazy loading is required; enum singleton is recommended in all other cases.
Double-checked locking requires the volatile keyword to prevent the JVM from publishing a partially constructed instance.
Reflection and serialization can both break Singleton guarantees on all implementations except enum singleton, which is immune to both attacks at the JVM level.
Avoid Singleton when it introduces hidden global state, blocks unit testing, or is used as a substitute for proper dependency management.
Spring beans are singleton-scoped by default within an ApplicationContext, which removes the need to implement the Singleton pattern manually in most modern Java applications.
*/