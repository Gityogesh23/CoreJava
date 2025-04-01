   
 import java.util.Scanner;

 // Remove character from string using String Methods: replace(), replaceAll(), replaceFirst()
 class ReplaceCharFromString {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         try {
             System.out.print("Enter String: ");
             String str = sc.nextLine();
             System.out.println("Original String Before Replace: " + str);
 
             if (str.isEmpty()) { // Corrected the string comparison
                 System.out.println("Please enter a valid string.");
                 return;
             }
 
             System.out.print("Enter the character to remove: ");
             String charToRemove = sc.next(); // Taking character input as a string
 
             String finalString = replaceChar(str, charToRemove); // Calling the method
             System.out.println("String After Replace: " + finalString);
         } 
         catch (Exception e) {
             System.out.println("Input Mismatch Exception");
         } 
         finally {
             sc.close(); // Closing the scanner
         }
     }
 
     // Method to remove character using replace(), replaceAll(), and replaceFirst()
     public static String replaceChar(String str, String charToRemove) {
         // Using replace()
         String replacedStr = str.replace(charToRemove, "");
 
         // Using replaceAll() - works the same way
         String replacedAllStr = str.replaceAll(charToRemove, "");
 
         // Using replaceFirst() - removes only the first occurrence
         String replacedFirstStr = str.replaceFirst(charToRemove, "");
 
         // Displaying all results
         System.out.println("\nUsing replace(): " + replacedStr);
         System.out.println("Using replaceAll(): " + replacedAllStr);
         System.out.println("Using replaceFirst(): " + replacedFirstStr);
 
         return replacedStr; // Returning the fully replaced string
     }
 }
 