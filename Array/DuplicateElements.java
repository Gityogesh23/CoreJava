import java.util.Scanner;
public class DuplicateElements {
   
    private static void isDuplicate(int[] arr) {
        boolean hasDuplicates = false; // Flag to check if duplicates exist
        System.out.println("\nDuplicate elements: ");
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    
                    System.out.print(" "+arr[i]);
                    hasDuplicates=true;
                    break;//  Avoid printing the same duplicate multiple times
                }
            }
        }
         
        if (!hasDuplicates) {
            System.out.println("No duplicates found.");
        }  
    }
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        try{
        int size=sc.nextInt();
        if(size<=0){
            System.out.println("give an valid  array size ");
            return;//Exit the program
        }
        int arr[]=new int[size];
        System.out.println("enter an elements inside array: ");
        for(int i=0;i<size;i++){
           arr[i]= sc.nextInt();
          }
       
       
        System.out.println("Array elements are: ");
        for(int i=0;i<size;i++){
            System.out.print(" "+arr[i]);
          }
       System.out.println();
       isDuplicate(arr);
    }catch(RuntimeException e){
        System.out.println("Invalid input. Please enter a valid array size and elements");  
      }
      finally{
          sc.close();//close resource
      }
     }        
     
}
