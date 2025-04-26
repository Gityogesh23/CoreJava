//instead of Demo_3 =>follow Demo_4
//Better Performance - Double-Checked Locking.


class DoubleCheckedSingleton{
    private static volatile DoubleCheckedSingleton instance;

    private DoubleCheckedSingleton(){
        System.out.println("Singleton instance created(Doble checked locking)");
    } 
    public static DoubleCheckedSingleton getInstance(){
        if(instance == null){
            synchronized(DoubleCheckedSingleton.class){
                if(instance==null){
                    instance=new DoubleCheckedSingleton();
                }
            }
        }
        return instance;
    }

 public void showMessage(){
    System.out.println("Hello from Double-Checked Singleton!");

  }
}
public class Singleton_Demo4 {
    public static void main(String[] args) {
        DoubleCheckedSingleton obj1=DoubleCheckedSingleton.getInstance();
        DoubleCheckedSingleton obj2=DoubleCheckedSingleton.getInstance(); 
        
        obj1.showMessage();
    System.out.println("Are Both Object Same ?" +(obj1==obj2));

        }
    }
 //here we check instance == null before and after locking to improve performance.
 //volatile ensures visibility between threads.

