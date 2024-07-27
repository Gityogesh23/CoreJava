
/*
 Problem Description
Given a string, determine if it is a palindrome. While checking for a palindrome, you have to ignore spaces, case, and all special characters; i.e. consider only alphanumeric characters.

Check the sample test case for reference.
Return 0 / 1 ( 0 for false, 1 for true ) for this problem

Problem Constraints
1 <= |A| <= 106

Input Format
The first argument is a string A.

Output Format
Return 0 / 1 ( 0 for false, 1 for true ) for this problem

Example Input
Input 1:
"A man, a plan, a canal: Panama"
Input 2:
"race a car"

Example Output
Output 1:
1
Output 2:
0

Example Explanation
Explanation 1:
The input string after ignoring spaces, and all special characters is "AmanaplanacanalPanama" 
which is a palindrome after ignoring the case.
Explanation 2:
The input string after ignoring spaces, and all special characters is "raceacar" which is not a palindrome
 */

 import java.util.Scanner;

 public class StringPalindrome2 {
 
     // Method to check if the given string is a palindrome
     public int isPalindrome(String A) {
         // Two pointers, one at left end and one at right end
         int front = 0;
         int rear = A.length() - 1;
 
         // Iterating from left and right at the same time
         while (front < rear) {
             // If either the left or right is not alphanumeric
             if (!Character.isLetterOrDigit(A.charAt(front))) {
                 front++;
                 continue;
             }
             if (!Character.isLetterOrDigit(A.charAt(rear))) {
                 rear--;
                 continue;
             }
             // If the char at current 'front' != char at current 'rear' return false
             if (Character.toLowerCase(A.charAt(front)) != Character.toLowerCase(A.charAt(rear))) {
                 return 0;
             }
 
             front++;
             rear--;
         }
         return 1;
     }
 
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        StringPalindrome2 stringpalindrome2 = new StringPalindrome2(); // Create an instance of Solution
         
         // Prompt user for input
         System.out.println("Enter the string:");
         String input = sc.nextLine(); // Read the user input
         
         // Call the isPalindrome method and get the result
         int result = stringpalindrome2.isPalindrome(input);
         
         // Print the result
         if (result == 1) {
             System.out.println("The string is a palindrome.");
         } else {
             System.out.println("The string is not a palindrome.");
         }
         
         sc.close(); // Close the scanner to avoid resource leaks
     }
 }
 