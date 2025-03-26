import java.util.Scanner;
import java.util.Arrays;

public class SortArray {
public static int[] sortArray(int[]originalArray){
    int[]SortedArray=originalArray;
    Arrays.sort(SortedArray);
    //to print sorted array
  
    return SortedArray;
}


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        System.out.println();
        int size=sc.nextInt();
        System.out.println("Insert an elements inside array: ");
        int[] originalArray=new int[size];
        for(int i=0;i<size;i++){
            originalArray[i] =sc.nextInt();
        }
        System.out.println("Array Elements are: ");
        for(int i=0;i<originalArray.length;i++){
            System.out.print(" "+originalArray[i]);
        }
        
       int[] sortedArray= sortArray(originalArray);
       System.out.println();
       System.out.println("Sorted Array Elements are:");
       for(int i=0;i<originalArray.length;i++){
        System.out.print("  "+sortedArray[i]);
      }
    }
}
