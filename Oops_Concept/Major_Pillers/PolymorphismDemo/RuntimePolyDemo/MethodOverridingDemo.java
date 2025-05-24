
//Runtime polymorphism=>Code is binding at runtime to an instance of a class.
//class=>Animal=> sublasses extends it=>Dog,Cow,Cat
class Animal{
    public void speak() {
        System.out.println("Generic animal sound");

    }

}

   class Dog extends Animal{
        @Override
        public void speak(){
            System.out.println("woof");
        }
   } 

   class Cow extends Animal{
    @Override 
    public void speak(){
        System.out.println("Moo");
    }

   }
   class Cat extends Animal{
    @Override
    public void speak(){
        System.out.println("Meow");
    }
   }
   
public class MethodOverridingDemo {
    public static void main(String[] args) {
     Animal myDog=new Dog();//Polymorphic reference: Animal type, Dog object
     Animal myCow=new Cow();//Polymorphic reference: Animal type, Cow object
     Animal myCat=new Cat();//Polymorphic reference: Animal type, Cat object

     Animal genericAnimal = new Animal(); // Regular reference

    // Demonstrating polymorphism: calling the same method on different object types
    // The actual method called depends on the object's runtime type
     myDog.speak();
     myCow.speak();
     myCat.speak();
     genericAnimal.speak(); // Calls Animal's speak()


    System.out.println("--- Method Overriding Demo ---");
   Animal[] animals={new Dog(),new Cow(),new Cat(),new Animal()}; //converting to polymorphic array.
    
   // Each animal object calls its specific speak() method
   System.out.println("\n--- Iterating through polymorphic array ---");

   for(Animal a:animals){
    // Here, the speak() method of the actual object type is called
        genericAnimal.speak();
    System.out.println("Animal sounds :"+ a.getClass().getSimpleName()+"says ");
    a.speak();
   }
    }
}
/*
     // Superclass
    class Animal {
        public void speak() {
            System.out.println("Generic animal sound");
        }
    }

    // Subclass Dog overriding the speak() method
    class Dog extends Animal {
        @Override // Annotation to indicate method overriding
        public void speak() {
            System.out.println("Woof!");
        }
    }

    // Subclass Cat overriding the speak() method
    class Cat extends Animal {
        @Override
        public void speak() {
            System.out.println("Meow!");
        }
    }

    // Subclass Cow overriding the speak() method
    class Cow extends Animal {
        @Override
        public void speak() {
            System.out.println("Moo!");
        }
    }

    public class PolymorphismDemo {
        public static void main(String[] args) {
            System.out.println("--- Method Overriding Demo ---");

            // Creating instances of different animal types
            Animal myDog = new Dog(); // Polymorphic reference: Animal type, Dog object
            Animal myCat = new Cat(); // Polymorphic reference: Animal type, Cat object
            Animal myCow = new Cow(); // Polymorphic reference: Animal type, Cow object
            Animal genericAnimal = new Animal(); // Regular reference

            // Demonstrating polymorphism: calling the same method on different object types
            // The actual method called depends on the object's runtime type
            myDog.speak(); // Calls Dog's speak()
            myCat.speak(); // Calls Cat's speak()
            myCow.speak(); // Calls Cow's speak()
            genericAnimal.speak(); // Calls Animal's speak()

            // You can also put them in an array and iterate
            Animal[] animals = {new Dog(), new Cat(), new Cow(), new Animal()};
            System.out.println("\n--- Iterating through polymorphic array ---");
            for (Animal animal : animals) {
                animal.speak(); // Each animal object calls its specific speak() method
            }
        }
    }
    
    
 */