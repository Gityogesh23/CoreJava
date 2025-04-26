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
