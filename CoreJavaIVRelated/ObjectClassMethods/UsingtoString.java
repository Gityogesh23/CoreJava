
/*toString() of Object class :public String toString();
If you want to represent any object as a string, toString() method comes into existence.
The toString() method returns the String representation of the object.
If you print any object, Java compiler internally invokes the toString() 
method on the object. So overriding the toString() method, returns the desired output, it can be the state of an object etc. depending on your implementation
 
The toString method for class Object returns a string consisting of the name of the class of which the object is an instance, the at-sign character `@', and the unsigned hexadecimal representation of the hash code of the object. In other words, this method returns a string equal to the value of:

 getClass().getName() + '@' + Integer.toHexString(hashCode()

 Returns:
a string representation of the object.
*/
class Animal{
    String name;
    int age;
    int animal_id;

    Animal(String name,int age,int animal_id){
       this.name=name;
       this.age=age;
       this.animal_id=animal_id;
    
    }
 void walk(){
    System.out.println("Animal is walking");
     }
     @Override 
     public String toString(){
         return name+" " + age + " "+animal_id;
     }
  void print(){
    System.out.println("animal is seen ,tha's a Big Big Bully, ijust Love It!");
  }
 }

class Dog extends Animal {
  Dog(String name,int age, int animal_id){
    super(name,age,animal_id);
  }
  @Override
  public void walk(){
    System.out.println("Dog is running");
  }
}
public class UsingtoString {
    public static void main(String[] args) {
        Animal a=new Animal("Happy",15,123);//simpl instantiation
        System.out.println(a);//Overrided from java.lang.object class's toString() method is called,otherwise hashcode value gets printed onto console.
        Animal a2=new Dog("bully",10,1234);//upcasting
        a2.walk();
        System.out.println(a2);
        Dog d1=new Dog("desi",11,12345);
        d1.walk();
        System.out.println(d1);
        Dog d2=(Dog)a2; //downcasting:assigning super tyep objetc with subtype class object :hences see below that is possible 
        d2.print();//we can able to access method of super type

    }

}
