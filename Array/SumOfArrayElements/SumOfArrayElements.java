
import java.util.Scanner;
//1)Iteration method.
/*
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
 */
//2)//recursion(Top -Down Approach)


public class SumOfArrayElements {

    static int getArray(int arr[],int len){
        int sum=0;
        if (len == 1) {
            return arr[0];
        }
            for(int i=0;i<len;i++){ 
                sum+=arr[i];   
            }
            return sum;
     }
               
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
            int l=arr.length; //length of array
            System.out.println("Sum of an elementd inside array are:  "+getArray(arr,l));
        }
    }
}