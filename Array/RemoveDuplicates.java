import java.util.Scanner;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
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
        for(int i=0;i<n;i++){
        System.out.print(" "+ arr[i]);
        }
        sc.close();//to close the open resource.
    }
    //1) =>by using collection=> Set=>now to remove duplicate elements from the array.
        Set<Integer>s1=new HashSet<>(); //hashset is the implementation clas of set interface.
        System.out.println("to duplicate elements inside array: ");
        s1.add(10);
        s1.add(20);
        s1.add(30);
        s1.add(10);
        System.out.println(s1.size());
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
