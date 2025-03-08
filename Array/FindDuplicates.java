import java.util.Scanner;

public class FindDuplicates {
    public static void main(String[] args) {
   // int[] arr=new int[5];//declaring and initializing array in java which takes 5 elements.
    //int[] array_1=new int[]{1,2,4,5,4,1};
//by custome input
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of an array");
    int size=sc.nextInt();
   
    System.out.println("Enter the elements inside an array: ");
   // int size; //local variable hence no need of initialization
    int[]array_1=new int[size];
    for(int i=0;i<size;i++){
     array_1[i]=sc.nextInt();
      
    }
    System.out.print("Array elements are: ");
    for (int i = 0; i < size; i++) {
        System.out.print(" " + array_1[i]);
    }
    System.out.print("duplicate elements from Array Are : ");
    System.out.println();
        //int[] array_2=new int[size];
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(array_1[i]==array_1[j]){
                    System.out.print("print duplicate elements are: "+" "+array_1[i]);
                }
            }
       }
       sc.close();//closing resource
   }
   

}