/*
 If two strings contain the same characters but in a different order, 
 they can be said to be anagrams. Consider dusty and study. In this case, 
 dusty's characters can be formed into a study, or study's characters can be 
 formed into dusty. Below is a java program to check if two strings are anagrams
 or not.
 */
import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagramString{
    public static boolean isAnagram(String str1, String str2) {
        // Quick check for length - if different lengths, can't be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }
        
        // Convert to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        // Convert to char arrays and sort
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        
        // Compare sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the first string: ");
            String str1 = sc.nextLine();
            
            System.out.print("Enter the second string: ");
            String str2 = sc.nextLine();
            
            if (isAnagram(str1, str2)) {
                System.out.println("Strings are anagrams");
            } else {
                System.out.println("Strings are not anagrams");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();  // Close the scanner to prevent resource leak
        }
    }
}