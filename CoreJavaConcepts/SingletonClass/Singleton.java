//package CoreJavaConcepts.SingletonClass;

public class Singleton {

    // Step 1: Private static variable of the class itself
    private static Singleton instance;

    // Step 2: Private constructor to prevent instantiation
    private Singleton() {
        // Private constructor
    }

    // Step 3: Public static method to get the unique instance of the class
    public static Singleton getInstance() {
        if (instance == null) {
            // If instance is null, create a new instance
            instance = new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        // Step 4: Test Singleton behavior
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        if (singleton1 == singleton2) {
            System.out.println("Both objects are the same instance.");
        } else {
            System.out.println("Different instances were created.");
        }
    }
}
