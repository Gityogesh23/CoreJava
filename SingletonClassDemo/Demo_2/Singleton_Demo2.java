//Lazy Initialization(Created When needed)

class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton(){}

    public static LazySingleton getInstance(){
        if(instance==null){
            instance=new LazySingleton();
            
        }
        return instance;
    }
public void showMessage(){
    System.out.println("Hello from Lazy singleton !");
}
}
 
public class Singleton_Demo2{
    public static void main(String[] args) {
       LazySingleton obj1=LazySingleton.getInstance();
       LazySingleton obj2=LazySingleton.getInstance();
       obj1.showMessage();
  }
}