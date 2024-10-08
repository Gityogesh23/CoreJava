/*
 Syntax to declare and array &its mandatory to specify size to an array :
 type[] arrayName;
TO CREATE AN Array further : numbers = new int[5];
type[] var-name = new type [size];
//int[]arr=new int[5];=>best way to intantiate array
 */
/* 
//1)by iteration
import java.util.Scanner;

public class FindLargestElement {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Give size of an array: ");
        try{
       int n= sc.nextInt();
       int[] array=new int[n];//proper syntax
        System.out.println("put array elements: ");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();//accepting an array elements one by one
        }
        System.out.println("array elements are :");
        for(int i=0;i<n;i++){
            System.out.print(" "+array[i]);

        }
        
        //sol of finding max elements started from here:Logic become
        int max=array[0];//set max var as first element and comapare first element with further elements.
        for(int i=0;i<array.length;i++){
            if(max<array[i]){
            max=array[i];//we can assign an greater element with max and print it =>it's Done!
            //we can do assignment many times but initialization only once.=>we know that
            }
        }
        System.out.println();
        System.out.println("Greatest/Maximum element inside array is:  "+max);
    
        }catch(Exception e){
         System.err.println("plz enter valid index/index should not be 0");
         return;
        }
    }
}

*/
//2)using itration
import java.util.Scanner;

public class FindLargestElement
{ 
   static int getmax(int arr[], int n){
       if(n==1)
       return arr[0];

       return Math.max(arr[n-1], getmax(arr, n-1));
   }
   public static void main(String args[])
   {

      int arr[] = {12, 13, 1, 10, 34, 10};//or int[] arr=new int[]{12,13,1,10,34};
      int n = arr.length;
      System.out.print(getmax(arr, n)); 
      
   }
}

//3)Recursion Approach: