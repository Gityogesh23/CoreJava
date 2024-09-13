import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the size of an array: ");
       
       int n=sc.nextInt(); 
       int[] arr=new int[n];//initializing array
       if(n<0){
        System.out.println("size should not be negative: ");
       }
       else{
        //to give an input as elements to array.
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
        }
        System.out.print(" " +"Array elements are: ");
        Set<Integer>hash_Set = new HashSet<>();
        for (int i=0; i<n; i++){
        hash_Set.add(arr[i]);
        System.out.print(" "+hash_Set);
        }
        System.out.println();
    
    //1) =>by using collection=> Set=>now to remove duplicate elements from the array.

    System.out.println("Array after removing duplicates: " + hash_Set);
    }
    sc.close();//to close the open resource.
    }
}
