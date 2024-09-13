import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class RemoveDuplicates{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the size of an array: ");
       
       int n = sc.nextInt(); 
       if (n < 1) {
           System.out.println("Size should not be negative.");
       } else {
           int[] arr = new int[n]; // initializing array

           // Input array elements
           System.out.println("Enter the array elements:");
           for (int i = 0; i < n; i++) {
               arr[i] = sc.nextInt();
           }

           // Print array elements
           System.out.print("Array elements are: ");
           for (int i = 0; i < n; i++) {
               System.out.print(" " + arr[i]);
           }
           System.out.println();

           // Use Set to remove duplicate elements
           Set<Integer> uniqueElements = new HashSet<>();
           for (int i = 0; i < n; i++) {
               uniqueElements.add(arr[i]);
           }

           // Print the unique elements (duplicates removed)
           System.out.print("Array after removing duplicates: ");
           for (int element : uniqueElements) {
               System.out.print(" " + element);
           }
           System.out.println();
       }
       sc.close(); // Close the scanner
    }
}
