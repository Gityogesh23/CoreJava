/*
 Problem Description

"A string is traditionally a sequence of characters, either as a literal constant or as some kind of variable." — Wikipedia: String (computer science)

This exercise is to test your understanding of Java Strings. A sample String declaration:

String myString = "Hello World!"

The elements of a String are called characters. The number of characters in a string is called the length, and it can be retrieved with the String.length() method.

Some important methods for Strings in Java:

stringName.charAt(index) : returns char value for the particular index
stringName.isEmpty() : checks if string is empty.(Return type boolean).
Learn more about strings and its methods by clicking here.

Task:

Given two strings of lowercase English letters, A  and B, perform the following operations:

Sum the lengths of A and B.
Determine if A is lexicographically larger than B (i.e.: does B come before A in the dictionary?).
Capitalize the complete string A and B and print them on a single line, separated by a space.

Input Format

The first line contains string A. The second line contains another string B. The strings are comprised of only lowercase English letters.


Output Format

There are three lines of output:

For the first line, sum the lengths of A and B.

For the second line, write Yes if A is lexicographically greater than B otherwise print No instead.

For the third line, Capitalize the complete string A and B and print them on a single line, separated by a space.


Example Input

Input 1:

 abc
 def


Example Output

Output 1:

 6
 No
 ABC DEF

Example Explanation

Explanation 1:

 Length of A = 3 and B = 3 so len(A) + len(B) = 6
 String "abc" is lexicographically smaller than "def"
 */

import java.util.Scanner;
public class StringQue_1 {
  public static void main(String[] agrs){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first String");
    String a=sc.nextLine();
    System.out.println("Enter the first String");
    String b=sc.nextLine();
    sc.close();
    //cal lengths of strings:for test case one :to cal length of strings
    int len1=a.length();
    int len2=b.length();
    System.out.println(len1+len2);
    //for sec test case:to check string a is greater than string b lexicographically
    if (a.compareTo(b)>0)
        System.out.println("Yes");
    else
    System.out.println("No");
    //for third test case:to covert string to uppercase
    System.out.println(a.toUpperCase()+" "+ b.toUpperCase());
    

  }
}

