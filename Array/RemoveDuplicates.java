import java.util.Scanner;
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
     
    }
}
