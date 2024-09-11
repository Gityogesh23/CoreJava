import java.util.Scanner;


public class ReverseArray {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n =sc.nextInt();
        int[] array=new int[n];
        System.out.print(" "+"Enter the array Elements: ");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println();
        System.out.print(" "+"Array Elements Are: ");
        for(int i=0;i<n;i++){
            System.out.print(" "+array[i]);

        }
        System.out.println();
        System.out.print(" "+"Reverse elements of array are :");
        for(int i=array.length-1;i>=0;i--){
            System.out.print(" "+array[i]); 
        }
   }
}
