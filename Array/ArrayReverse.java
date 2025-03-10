import java.util.Scanner;
public class ArrayReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int size=sc.nextInt();
        int array[]=new int[size];
        System.out.println("Enter the  array Elements: ");

        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();

        }
        System.out.print("Array elements are: ");
        for(int i=0;i<size;i++){
            System.out.print(" "+array[i]);
        }
        System.out.println();
        System.out.print("Reversed  array  Elements are : ");

        for(int j=array.length-1;j>=0;j--){
            System.out.print("  " +array[j]);
        }
    }
}
