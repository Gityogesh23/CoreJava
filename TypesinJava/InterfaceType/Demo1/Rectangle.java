interface Shape1 {
  void calArea();
}

interface Shape2 {
  void calArea(); // Same method signature
}

class Rectangle implements Shape1, Shape2 {

  // Implementation for calArea() - this single implementation satisfies both interfaces
  @Override
  public void calArea() {
      System.out.println("Calculating area for a Rectangle.");
  }

  // You can add specific methods or logic if you need to differentiate behavior
  public void calAreaFromShape1() {
      System.out.println("Calculating area as a Shape1.");
      calArea(); // Calls the common implementation
  }

  public void calAreaFromShape2() {
      System.out.println("Calculating area as a Shape2.");
      calArea(); // Calls the common implementation
  }

  public static void main(String[] args) {
      Rectangle rect = new Rectangle();
      rect.calArea();         // Calls the common calArea() implementation
      rect.calAreaFromShape1(); // Calls the Shape1-specific "wrapper"
      rect.calAreaFromShape2(); // Calls the Shape2-specific "wrapper"

      Shape1 shape1Ref = rect;
      shape1Ref.calArea();    // Calls the common calArea() implementation through Shape1 reference

      Shape2 shape2Ref = rect;
      shape2Ref.calArea();    // Calls the common calArea() implementation through Shape2 reference
  }
}

/*
 Explanation of the Corrected Code:

Single Implementation: Since both interfaces have the same method signature, the 
Rectangle class provides only one implementation for calArea(). This single 
implementation satisfies the requirements of both Shape1 and Shape2.

No Direct super Call for Interfaces: You cannot directly call a specific interface 
method using super like you might with inheritance from a class. Interfaces don't 
have an implementation to inherit from in that way.

Achieving Different "Calls" Conceptually: To achieve the idea of calling something 
specific to Shape1 or Shape2, you can:

Add Wrapper Methods: Introduce new methods in the Rectangle class 
(like calAreaFromShape1() and calAreaFromShape2()) that provide a context or 
additional behavior before or after calling the common calArea() implementation.
Use Interface References: When you hold a Rectangle object using a reference to either Shape1 or Shape2, calling calArea() will still execute the same Rectangle's implementation. The interface reference doesn't change the underlying object's behavior.
Why Your Original Approach Didn't Work:

The @Override annotation was in the wrong place (inside a static method).
rect.super.calArea() is invalid syntax for calling interface methods. super is 
for accessing superclass members.
The implementation of calArea() was incorrectly placed within the main method.
In summary, when a class implements multiple interfaces with the same method 
signature, you provide a single implementation in the class that satisfies all 
those interfaces. If you need to differentiate behavior based on the "interface 
type," you'll typically do so through additional methods or by how you use the 
object references.
 */