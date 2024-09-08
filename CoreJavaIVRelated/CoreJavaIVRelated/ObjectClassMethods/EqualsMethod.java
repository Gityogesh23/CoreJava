// package ObjectClassMethods;
/*
Object class equals method :Brush up the various methods such as:
methods of java.lang.Object class:
1)public String toString();
2)public boolean equals(Object obj);
3)public int hashCode();
 Here is some description:
Note:note, when we override equals(), it is recommended to also override the 
hashCode() method. If we don’t do so, equal objects may get different hash-values; 
and hash based collections, including HashMap, HashSet, and Hashtable do not work 
properly.

if we cam't Override:
class Complex {
	private double re, im; 
	
	public Complex(double re, double im) {
		this.re = re;
		this.im = im;
	}
}

// Driver class to test the Complex class
public class Main {
	public static void main(String[] args) {
		Complex c1 = new Complex(10, 15);
		Complex c2 = new Complex(10, 15);
		if (c1 == c2) {
			System.out.println("Equal ");
		} else {
			System.out.println("Not Equal ");
		}
	}
}
wrong output:Not Equals;
 Reason:The reason for printing “Not Equal” is simple: when we compare c1 and c2, 
 it is checked whether both c1 and c2 refer to same object or not (object variables are always references in Java). c1 and c2 refer to two different objects, 
 hence the value (c1 == c2) is false. If we create another reference say c3 like following, then (c1 == c3) will give true.
 
 Note: It is generally necessary to override the hashCode() method whenever this 
 method is overridden, so as to maintain the general contract for the hashCode 
 method, which states that equal objects must have equal hash codes. 

 ## Why Override equals() and hashCode() Simultaneously
Consistency Requirement: If two objects are considered equal by the equals() method,
 they must return the same hash code. This requirement ensures the correct behavior
  in hash-based collections like HashSet and HashMap.

Hash-Based Collections:
These collections use hash codes to quickly locate objects. If equals() is
 overridden without hashCode(), or if the hash code does not remain consistent
  with equality, the collection might not be able to correctly find, insert, or remove objects.
Example of Incorrect Behavior Without Proper hashCode():

Suppose you override equals() but not hashCode(). In a HashSet, two equal objects (as determined by equals()) may not be recognized as equal if they have different hash codes. This can lead to issues like duplicate entries or inability to find objects.
*/
import java.util.Objects;

class Person {
    private String name;
    private int age;
    private int id;
    private String dept;

    // Constructor
    Person(String name, int age, int id, String dept) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.dept = dept;
    }

    // Override equals() to compare Person objects
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Person)) return false;
        Person person = (Person) obj;
        return age == person.age && id == person.id &&
               Objects.equals(name, person.name) &&
               Objects.equals(dept, person.dept);
    }

    // Override hashCode() to maintain consistency with equals()
    @Override
    public int hashCode() {
        return Objects.hash(name, age, id, dept);
    }

    // Override toString() to display person details
    @Override
    public String toString() {
        return name + " " + age + " " + id + " " + dept;
    }
}

class Employee extends Person {
    // Constructor
    Employee(String name, int age, int id, String dept) {
        super(name, age, id, dept);
    }

    // Optionally override toString() if you need specific Employee details
    @Override
    public String toString() {
        return super.toString();
    }
}

public class EqualsMethod{
    public static void main(String[] args) {
        Person p1 = new Person("Yogesh", 25, 123, "Computer");
        Person p2 = new Person("Kiran", 55, 234, "Farming");
        System.out.println(p1.equals(p2)); // Should print false

        // To check Employee class equality
        Employee e1 = new Employee("Davinder", 55, 7, "TPO");
        Employee e2 = new Employee("Johnson", 54, 786, "Head");
        System.out.println(e1.equals(e2)); // Should print false
    }
}

