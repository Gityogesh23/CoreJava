/*
always prefer to go with Arraylist b'z its size is increments at runtime by half as we know 
and vector size is increase by its existing size or double.
*/
import java.util.Scanner;
import java.util.Collection;
//import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


    class UsingArrayList{
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
    List<Integer>list=new ArrayList<>(); //More Generic
    System.out.println("enter the elements: ");
    int n=sc.nextInt();//giving size of array elements

        // Loop to accept input until the user types 'done'
        while (true) {
        String input=sc.next();//giving size of array elements 
/*
Definition and Usage. The equalsIgnoreCase() method compares two strings,
ignoring lower case and upper case differences. This method returns true 
if the strings are equal, and false if not. Tip: Use the compareToIgnoreCase()method
to compare two strings lexicographically, ignoring case differences.
 */
        if(input.equalsIgnoreCase("done")){
           break;
        }
    
    try{
        // Parse the input as an integer and add it to the ArrayList
            int number=Integer.parseInt(input);
            list.add(number);
    }catch(NumberFormatException e){
            //e.printStackTrace();
            System.out.println("plz enter valid number OR type done to finish");
            }
        }
          // Display the elements of the dynamic array
          System.out.println("You entered the following elements:");
          for (int element : list) {
              System.out.print(element + " ");
         }
       }
    }

    
 /*
     How the Code Works
Using ArrayList:

An ArrayList<Integer> is used to store the elements. Unlike arrays, ArrayList does not require a predefined size, making it ideal for dynamic input.
Accepting Input:

The program prompts the user to enter elements one by one.
The loop continues to accept input until the user types "done".
The next() method of Scanner is used to read the input as a string. The input is then checked to see if it's "done".
Error Handling:

The try-catch block ensures that the program can handle non-integer inputs gracefully. If the user enters something that isn't an integer or "done", they are prompted to try again.
Displaying the Array:

Once the user finishes entering elements, the program prints out the elements of the dynamic array.

QUE) Can ArrayList<E> works with primitive dataType?
ans:No, ArrayList in Java does not work directly with primitive data types like int, char, boolean, etc. This is because 
ArrayList is a part of the Java Collections Framework, which only supports objects, not primitive types.

However, you can use the wrapper classes that correspond to the primitive types. 
These wrapper classes allow you to use primitive values within an ArrayList. For example:

int → Integer
char → Character
boolean → Boolean
double → Double

Autoboxing and Unboxing:
Autoboxing: Java automatically converts a primitive value to its corresponding 
wrapper class object when needed. For example, when you add 10 to an ArrayList<Integer>,
 Java automatically converts it from int to Integer.
Unboxing: Java automatically converts a wrapper class object back to its corresponding 
primitive value when needed. For example, when you retrieve an Integer from the ArrayList,
 it can be automatically converted to int.
Why Not Primitive Types?
ArrayList (and other collections) work with objects because collections are 
designed to hold references to objects. Primitive types in Java are not objects;
 they are simple data types with no methods or properties associated with them. 
 Wrapper classes, on the other hand, are objects and can be stored in collections.

Conclusion:
If you need to store primitive values in an ArrayList, use the corresponding 
wrapper classes like Integer, Character, Boolean, etc. Java handles the conversion 
between primitives and their wrapper classes automatically through autoboxing and 
unboxing, making it convenient to work with collections of primitive-like values.
*/