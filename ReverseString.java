//package CoreJava.IVCodes;
/*
way 1)to reverse String using charAt() method.
import java.util.Scanner;
public class ReverseString {
    static String str,rstr="";

    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    
     System.out.println("Enter the string  want to reverse: :");
     str=sc.nextLine();
     for(int i=0;i<str.length();i++){
     char ch=str.charAt(i);
     rstr=ch+rstr;
    
    }
    System.out.println("reverse string "+rstr);
    }
}
*/
/*
2. Reverse a String using String Builder / String Buffer Class
    
    import java.util.*; 
public class StringRev{
// Function to reverse a string in Java using StringBuilder
public static String rev(String s){
return new StringBuilder(s).reverse().toString();
}
public static void main(String[] args){
String s= "Welcome to Edureka"; // Note that string is immutable in Java
s= rev(s);
System.out.println("Result after reversing a string is : "+s);
}
}

//now by using StringBuffer
import java.util.*; 
public class StringRev{
 // Function to reverse a string in Java using StringBuffer
public static String rev(String s){ 
return new StringBufferr(s).reverse().toString(); 
} 
public static void main(String[] args){ 
String s= "Welcome to Edureka"; 
// Note that string is immutable in Java
 s= rev(s); 
System.out.println("Result after reversing a string is : "+s); 
} 
}
*/
/*
//3rd way: Reversing a String using Reverse Iteration.

import java.util.*;
public class StringRev{
// Function to reverse a string in Java 
public static String reverseString(String s){
//Converting the string into a character array
char c[]=s.toCharArray();
String reverse="";
//For loop to reverse a string
for(int i=c.length-1;i>=0;i--){
reverse+=c[i];
}
return reverse;
}
 
public static void main(String[] args) {
System.out.println(reverseString("Hi All"));
System.out.println(reverseString("Welcome to Edureka Blog"));
}
}
*/
//4th way:4. String Reverse using Recursion:this is most preferable and imp to do in IV Technical round.
/*
return: This keyword indicates that the method will return the result of the following expression.

str.charAt(str.length() - 1): This retrieves the last character of the string str.

str.length() - 1: This calculates the index of the last character in the string (since string indices are 0-based).
str.charAt(): This method returns the character at the specified index.
+: This operator concatenates two strings. In this context, it concatenates the last character of str with the result of the recursive call.

rev(str.substring(0, str.length() - 1)): This is the recursive call to the rev method.

str.substring(0, str.length() - 1): This creates a new string that consists of the original string str minus its last character.
str.substring(0, n): This method returns a new string that is a substring of str, starting from index 0 and ending at index n-1.
Example Execution
Let's see how the method works with an example string "abc":

Initial Call: rev("abc")

str.length() == 0 is false.
str.charAt(str.length() - 1) returns 'c'.
rev(str.substring(0, str.length() - 1)) calls rev("ab").
Second Call: rev("ab")

str.length() == 0 is false.
str.charAt(str.length() - 1) returns 'b'.
rev(str.substring(0, str.length() - 1)) calls rev("a").
Third Call: rev("a")

str.length() == 0 is false.
str.charAt(str.length() - 1) returns 'a'.
rev(str.substring(0, str.length() - 1)) calls rev("").
Base Case Call: rev("")

str.length() == 0 is true.
Returns " ".
Returning from Recursive Calls:

Third Call: Returns 'a' + " " = "a ".
Second Call: Returns 'b' + "a " = "ba ".
Initial Call: Returns 'c' + "ba " = "cba ".
Summary
The method reverses the input string recursively by appending the last character of the current string to the result of the reverse of the substring that excludes the last character.
The base case handles an empty string by returning a space " ".
The method concatenates the characters in reverse order, building the reversed string as the recursion unwinds.
*/

import java.util.*;
public class StringRecursion{
String rev(String str) {
if(str.length() == 0)
return " ";
return str.charAt(str.length()-1) + rev(str.substring(0,str.length()-1)); }
public static void main(String[ ] args) {
StringRecursion r=new StringRecursion();
Scanner sc=new Scanner(System.in);
System.out.print("Enter the string : ");
String s=sc.nextLine();
System.out.println("Reversed String: "+r.rev(s));
   }
}
/*
//way 5th:Reverse the letters present in the String.
public class stringreverse {
public static void main(String[] args) {
// TODO Auto-generated method stub
String str = "Welcome To Edureka";
String[] strArray = str.split(" ");
for (String temp: strArray){
System.out.println(temp);
}
for(int i=0; i<3; i++){ char[] s1 = strArray[i].toCharArray(); for (int j = s1.length-1; j>=0; j--)
{System.out.print(s1[j]);}
System.out.print(" ");
}
}
}
*/


















