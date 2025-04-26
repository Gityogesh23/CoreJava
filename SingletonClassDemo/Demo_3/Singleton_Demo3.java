//Go After this=> Through Demo_4(i.e Doble-checked Locking demo)
//Thread Safe Singleton(Synchronized Method)
/*
What is Thread-safe Singleton?
Thread-safe Singleton means:
👉 Even when multiple threads are trying to create an instance at the same time, 
   only one instance of the Singleton class will be created.

In multithreading, if Singleton is not thread-safe, it’s possible that two different threads 
create two different instances, which breaks the Singleton pattern!
# Why do we need Thread-safety for Singleton?
Suppose Thread A and Thread B both call getInstance() at the same time —
👉 Without proper locking, both threads might create separate instances ❗
✅ We want to avoid that and ensure only one object is created, no matter how many threads
 try to access it at the same time.

How to make Singleton Thread-safe?
✅ By synchronizing the method or block which creates the instance.
 
*/
class ThreadSafeSingleton{
    private static ThreadSafeSingleton instance;
     private ThreadSafeSingleton(){
        System.out.println("Singleton instance created (Thread Safe)");
     }
//
    // Synchronized method to control simultaneous access
    //synchronized keyword ensures only one thread can execute getInstance() at a time. 
    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance==null){
            instance=new ThreadSafeSingleton();
            
        }
        return instance;
     }
     public void showMessage(){
        System.out.println("Hello from Thread-safe Singleton");
     }
}
//Main Singleton_Demo3 thread safe.java
public class Singleton_Demo3 {
    public static void main(String[] args) {
        ThreadSafeSingleton obj1=ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton obj2=ThreadSafeSingleton.getInstance();
        obj1.showMessage();
        System.out.println("Are Both Object Same ?" +(obj1==obj2));
    }
}
