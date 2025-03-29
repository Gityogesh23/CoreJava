
import java.util.Scanner;
public class SwapWithoutTemp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter the First String");
            String str1=sc.nextLine();
           
            System.out.println("Enter the Second String");
            String str2=sc.nextLine();
            System.out.println("Before swap: " + str1 + " " + str2);
            str1=str1+str2;//appending both string and combinely become string one
            //sop is just for better understatnding 
            System.out.println("after appending str1 becomes:"+str1); 
            str2=str1.substring(0,str1.length()-str2.length());

            str1=str1.substring(str2.length());

            System.out.println("After swap: " +str1 + " " + str2);
        }
    }
    /*
     What is the use of the substring() method in Java?
The substring method is used to return substring from a specified string. This method takes two parameters i.e., beginIndex (the starting index) and endIndex (the ending index). In the case of substring(), method startIndex is inclusive and endIndex is exclusive.

Syntax: 

substring(int beginIndex, int endIndex)
     */
