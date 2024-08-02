// package CoreJavaConcepts;
/*
## Read Before This:Abstract.txt file and Interface.txt file.

  Abstract class:Def-If  is-a relationship exist  between super type and subtype AND if we want same 
 method signature in subtype so we should declare supertype as Abstact.
 A class which is declared with the abstract keyword is known as an abstract class in Java. It can have abstract and non-abstract methods (method with the body).

 Before learning the Java abstract class, let's understand the abstraction in Java first.
 Interface:Def-If is-a relationship is not present in super type and sub type and if we want same
 method signature within subtype then super type should be interface.
 */

 //Abstract class example(ignor class name )=>
 
    abstract class Bike{  
        Bike(){System.out.println("bike is created");}  
        abstract void run();  
        void changeGear(){System.out.println("gear changed");}  
      }  
     //Creating a Child class which inherits Abstract class  
      class Honda extends Bike{  
      void run(){System.out.println("running safely..");}  
      }  
     //Creating a AbstractAndInterface class which calls abstract and non-abstract methods  
     public class AbstractAndInterface{ 
      public static void main(String args[]){  
       Bike obj = new Honda();  
       obj.run();  
       obj.changeGear();  
      }  
     }
/*
 //Creating interface that has 4 methods  
interface A{  
void a();//bydefault, public and abstract  
void b();  
void c();  
void d();  
}  
  
//Creating abstract class that provides the implementation of one method of A interface  
abstract class B implements A{  
public void c(){System.out.println("I am C");}  
}  
  
//Creating subclass of abstract class, now we need to provide the implementation of rest of the methods  
class M extends B{  
public void a(){System.out.println("I am a");}  
public void b(){System.out.println("I am b");}  
public void d(){System.out.println("I am d");}  
}  
  
//Creating a test class that calls the methods of A interface  
class Test5{  
public static void main(String args[]){  
A a=new M();  
a.a();  
a.b();  
a.c();  
a.d();  
}}  

Output:
       I am a
       I am b
       I am c
       I am d
 */