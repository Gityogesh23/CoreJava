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