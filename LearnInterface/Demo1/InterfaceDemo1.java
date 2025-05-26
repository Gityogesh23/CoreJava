
    interface MyInterface1 {
        default void greet() {
            System.out.println("default of myInterface1");
        }
    }
    
    interface MyInterface2 {
        default void greet() {
            System.out.println("default of myInterface2");
        }
    }
    
    public class InterfaceDemo1 implements MyInterface1, MyInterface2 {
        @Override
        public void greet() {
            System.out.println("welcome to greet of InterfaceDemo class !!");
    
            // These calls MUST be inside the method body
            // Note: It's MyInterface1.super.greet() NOT MyInterface1.super().greet()
            MyInterface1.super.greet(); // Call the default implementation from MyInterface1
            MyInterface2.super.greet(); // Call the default implementation from MyInterface2
    
            System.out.println("...and that's how it's done!");
        }
    
        public static void main(String[] args) {
            InterfaceDemo1 interfacedemo = new InterfaceDemo1();
            interfacedemo.greet();
        }
    }