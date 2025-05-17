import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindDuplicates1 {
    public static void findDuplicates(int[]array){
        if (array.length == 0) {
            System.out.println("Array is empty.");
        }
       //we will go with HashSet or Set
       Set<Integer>seen=new HashSet<>();
       Set<Integer>duplicates=new HashSet<>();
       
       //for each loop
       for(int num:array){
        if(!seen.add(num)){
           duplicates.add(num); 
        }
       }
       if(duplicates.isEmpty()){
        System.out.println("no duplicate elements");
       }else{
        System.out.println("duplicate elements are: "+duplicates);
 
       }
    }
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of an array: ");
    int n =sc.nextInt();
    int[] array=new int[n];
    System.out.println(" "+"Enter the array Elements: ");
    for(int i=0;i<n;i++){
        array[i]=sc.nextInt();
    }
    System.out.println();
    System.out.print(" "+"Array Elements Are: ");
    for(int i=0;i<n;i++){
        System.out.println(" "+array[i]);

    }
    findDuplicates(array);
  }
}    
