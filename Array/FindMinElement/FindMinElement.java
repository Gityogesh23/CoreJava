import java.util.Scanner;
/*
 1)Using Iteration
 2)Using top-Down recursion
 3)Using bottom-up Approach
 */
//1)Using Iteration:
public class FindMinElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n=sc.nextInt();
        int[]arr=new int[n];
        
        if(n<1){
            System.out.println("Kindly enter the valid size only");
        }
        else{
            System.out.print(" "+"Enter the Aray Elements : ");
            for(int i=0;i<n;i++){
               arr[i]=sc.nextInt();        
                  
            }
            System.out.println("Array Elements are:");
            for(int i=0;i<n;i++){
                System.out.print(" " +" "+arr[i]);
            }
           // System.out.println("");
        
        //logic to print min number from array:
        int min=arr[0];
        System.out.println();
            for(int i=0;i<n;i++){
                // System.out.print("To find the minimum Element from array : "+arr[i]);
                if(min>arr[i]){
                    min=arr[i];
                    //System.out.println();
                }
            }
            System.out.print("Smaller element become : "+min);
        }
        sc.close();
    }
}
