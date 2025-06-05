
//Base class
class Vehicle{
    void engine(){
        System.out.println("Vehicle has a Engine");
    }

}
//Intrmediate Class
class Car extends Vehicle{
    void wheels(){
        System.out.println("car has a 4 Wheels");
    }
}
//Interface 1
interface Horn{
    void blowHorn(); 
 
}
//Interface 2
interface Driveable{
 void drive();
 }

//concrete class -uses hybrid inheritance
class Toyota extends Car implements Horn,Driveable{
    public void blowHorn(){
        System.out.println("Toyota horn: Bow Bow");
    }

 public void drive(){
  System.out.println("Toyota is driving.");
}
}
//main class
public class HybridDemo {
    public static void main(String[] args) {
        Toyota t=new Toyota();
        t.engine(); // from Vehicle
        t.wheels(); // from Car
        t.blowHorn(); // from Horn interface
        t.drive();   // from Driveable interface
    }
}
