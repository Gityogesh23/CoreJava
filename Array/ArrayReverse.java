import java.util.Scanner;
public class ArrayReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int size=sc.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();

        }
        System.out.print("Array elements are: ");
        for(int i=0;i<size;i++){
            System.out.println("array elements are: "+array[i]);
        }
        for(int i=array.length-1;i>=0;i++){
            System.out.print("Reverse array elements are: array[i]);
        }
    }
}
