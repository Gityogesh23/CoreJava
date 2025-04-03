import java.util.Scanner;

//To print duplicate elements inside array

class PrintOddAndEven{
    public static void OddAndEven(int[]arr){
        System.out.println(" Even Elements are: ");
       for(int i=0;i<arr.length;i++){
          
           if(arr[i]%2==0){
               System.out.print(" "+arr[i]); //odd=>arr[i]%2==0 then even or then odd
           }
       }
       System.out.println();

       System.out.println(" Odd Elements are: ");
       
       for(int i=0;i<arr.length;i++){
       if(arr[i]%2!=0){
               System.out.print(" "+arr[i]);
              }
           }
    }
    public static void main(String[] rgs){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
       int size= sc.nextInt();
       int [] arr=new int[size];
       System.out.println("Enter the Elements inside Array: ");

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
       System.out.println("Elements inside Array Are : ");

        for(int i=0;i<arr.length;i++){
        System.out.print(" "+arr[i]);
        
        }
        System.out.println();
        OddAndEven(arr);
    }
}