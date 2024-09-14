// Java Interface can not have constructor but Abstract classes can have a constructor
//Why a Constructor can not be final, static or abstract in Java?
/*
Constructor in java is a special type of method which is different from normal java 
methods/ordinary methods. Constructors are used to initialize an object. Automatically
 a constructor is called when an object of a class is created. It is syntactically similar
  to a method but it has the same name as its class and a constructor does not have a 
  return type. 

Java constructor can not be final

One of the important property of java constructor is that it can not be final. 
As we know, constructors are not inherited in java. Therefore, constructors are 
not subject to hiding or overriding. When there is no chance of constructor overriding, 
there is no chance of modification also. When there is no chance of modification, then 
no sense of restricting modification there. We know that the final keyword restricts 
further modification. So a java constructor can not be final because it inherently it 
cannot be modified. Also, a java constructor is internally final. So again there is no 
need for final declaration further. 

Example: Suppose we are declaring a java constructor as final, now let’s see what is 
happening.
 
import java.io.*;
class GFG {
 
    // GFG() constructor is declared final
    final GFG()
    {
        // This line can not be executed as compile error
        // will come
        System.out.print(
            "Hey you have declared constructor as final, it's error");
    }
}
class Main {
    public static void main(String[] args)
    {
        // Object of GFG class created
        // Automatically GFG() constructor called
        GFG obj = new GFG();
    }
}
From the above example also it is clear that if we are defining constructor as final
the compiler will give an error as modifier final not allowed.

*/


// java class and a subclass
import java.io.*;

class Constructor {
	public static void main(String[] args) {
		

	public Constructor()
	{
		// Constructor of GFG class
		System.out.println("calling Constructor");
	}
}
class Constructor1 extends Constructor{

	Constructor1()
	{
		// Constructor of SubClass class
		// By default super() is hidden here
		// So Super class i.e GFG class constructor called
		System.out.println("Subclass Constructor");
	}
	public static void main(String args[])
	{
		// SubClass class object created
		// Automatically SubClass() constructor called
		Constructor1 obj = new Constructor1();
	}
}
