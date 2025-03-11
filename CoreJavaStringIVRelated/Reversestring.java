import java.security.Key;
import java.util.Scanner;
class ReverseString{
    
    public static String revString(String str){
        
       
       // int num1=0,num2=1;
       str=str.replaceAll("[^A-Za-z]" ,"");//line is important
       String  rstr=" ";
      
       for(int i=str.length()-1;i>=0;i--){
           rstr=rstr+str.charAt(i);//rstr+=str.charAt();
       }
        return rstr;
    }
       
        
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string to be reverse :");
        String str=sc.nextLine();
        String str_1=revString(str);
        System.out.println("reverse String become: "+str_1); 
        sc.close();
    }
   
}

/*
 //Using Internal java Method
class InvertString
{
public static void main(String args[])
{
StringBuffer a = new StringBuffer("Java programming is fun"); 
System.out.println(a.reverse());
}
}
 */
/* 

//  This approach creates a new String object in every loop iteration, 
//  which is memory inefficient and slow.
 
public class Reversestring {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String: ");     
    String str=sc.nextLine();
    String rstr=" ";//initialize rstr

    for(int i=str.length()-1;i>=0;i--){
         rstr=rstr+str.charAt(i);
       
    }
    System.out.println(""+rstr+"");

}
}
)
 */

/* 
//logic 2: using StrigBuilder and in one line/Same we can done using StringBuffer As well.
//Use StringBuffer if thread safety is required; otherwise, prefer StringBuilder for better performance.
class ReverseString{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str=sc.nextLine().replaceAll("[^A-Za-z]","");
        String str1=new StringBuilder(str).reverse().toString();//finish conv StringBuilder's mutable string into String
        System.out.println("Reversed String Become:  "+str1);
    }

}
*/


// Java program to reverse a string using backward traversal
//StringBuilder is mutable=>
//meaning it can modify the existing object instead of creating a new one every time.

/* 
public class Reversestring {

    public static String revString(String str){
        StringBuilder rstr=new StringBuilder();
        // Traverse on str in backward direction
        // and add each character to a new string
        for(int i=str.length()-1;i>=0;i--){
                rstr.append(str.charAt(i));
        }
        // #StringBuilder allows modifications without creating new objects (efficient).
        // # String is immutable, so each modification creates a new object.
        //  # toString() is needed when you need to store or return the result as a String.
    //     Key Reasons for Calling .toString() on StringBuilder:=>
    // 1.  StringBuilder is Mutable (Changes in Place)
    //     StringBuilder allows modification of the string without creating a new object.
    //     However, many methods (like reverse()) modify the StringBuilder directly instead of returning a String.
    // 2. toString() Converts Mutable StringBuilder to Immutable String
    //    StringBuilder does not inherit from String, so you cannot use String methods (like equals(), substring(), etc.) on it.
    //    If you need a String, you must explicitly convert using .toString().

        return rstr.toString();
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string ");
        String str=sc.nextLine();
        String rstr=revString(str);//as its static method.eithe call by class name or directly as both are static context=>so that we know through static context we can call static method
        System.out.println("Reverse string become: "+rstr);
    }


}
 */

/*
 // Java program to reverse a string using two pointers

class ReverseString {
    static String revString(String s) {
        int left = 0, right = s.length() - 1;
      
    // Use StringBuilder for mutability
        StringBuilder res = new StringBuilder(s);
      
    // Swap characters from both ends till we reach
    // the middle of the string
        while (left < right) {
            char temp = res.charAt(left);
            res.setCharAt(left, res.charAt(right));
            res.setCharAt(right, temp);
            left++;
            right--;
        }
  
    // Convert StringBuilder back to string
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "yogesh";
        System.out.println(revString(s));
    }
}
 */
