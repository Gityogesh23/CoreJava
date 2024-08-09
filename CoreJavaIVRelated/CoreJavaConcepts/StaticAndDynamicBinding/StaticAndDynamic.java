/* 
class StaticAndDynamic{  
    private void eat(){System.out.println("dog is eating...");}  
     
    public static void main(String args[]){  
        StaticAndDynamic sd1=new StaticAndDynamic();  
     sd1.eat();  
    }  
   }

   */

   class StaticAndDynamic1 {  
    // Method in superclass
    void eat() {
        System.out.println("animal is eating...");
    }  
}  
     
class StaticAndDynamic extends StaticAndDynamic1 {  
    // Overridden method in subclass
    void eat() {
        System.out.println("dog is eating...");
    }  
     
    public static void main(String args[]) {  
        // Creating a reference of StaticAndDynamic1 but object of StaticAndDynamic
        StaticAndDynamic1 sd = new StaticAndDynamic();  
        // This will call the eat method of StaticAndDynamic (dynamic method dispatch)
        sd.eat();  
    }  
}  
