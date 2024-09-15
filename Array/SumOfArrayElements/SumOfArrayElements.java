import java.util.Scanner;

public class SumOfArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        
        int n = sc.nextInt(); 
        if (n < 1) {
            System.out.println("Size should not be negative.");
        } 
        else {
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
        
        //logic to sum the array elements
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        System.out.println("Sum of Array Elements: "+sum);
    }
 }

}
