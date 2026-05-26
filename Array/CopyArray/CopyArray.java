import java.util.Scanner;

 
class CopyArray{
    public static  int[] copyArray(int[]arr1){

        int[] arr2=new int[arr1.length];//declaring and initializing array
        for(int i=0;i<arr1.length;i++){
            arr2[i]=arr1[i];
        }
        return arr2;
    }
  
   
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size of an array: ");
       try{
       int size=sc.nextInt();
       if(size<0){
        System.out.println("size should be positive: ");
       }
       int[] arr=new int[size]; //initialization of an array=>original Array
       System.out.println("Enter the Elements inside Array : ");
       for(int i=0;i<size;i++){
       arr[i]=sc.nextInt();
       
       } 
       System.out.print("Original array become: ");
       for(int i=0;i<size;i++){
        System.out.println(" "+arr[i]);
       }
       int[]copiedArray=copyArray(arr);
       System.out.println();
       System.out.print(" "+"Copied array become: ");
      
       for(int i=0;i<copiedArray.length;i++){
        
       System.out.println(" "+copiedArray[i]);
       
    }
    }catch(Exception e){
        System.out.println("input mismatch exception ");
       }
        }
    }


/*
Hard Coded:
public class CopyArray{    
    public static void main(String[] args) {        
             //Initialize array     
        int [] arr1 = new int [] {1, 2, 3, 4, 5};     
         //Create another array arr2 with size of arr1    
        int arr2[] = new int[arr1.length];    
        //Copying all elements of one array into another    
        for (int i = 0; i < arr1.length; i++) {     
            arr2[i] = arr1[i];     
        }      
         //Displaying elements of array arr1     
        System.out.println("Elements of original array: ");    
        for (int i = 0; i < arr1.length; i++) {     
           System.out.print(arr1[i] + " ");    
        }     
            
        System.out.println();    
            
        //Displaying elements of array arr2     
        System.out.println("Elements of new array: ");    
        for (int i = 0; i < arr2.length; i++) {     
           System.out.print(arr2[i] + " ");    
        }     
    }    
}    
*/
/*
Arrays are used to store multiple values in a single variable, instead of declaring 
separate variables for each value.

To declare an array, define the variable type with square brackets [ ] :
eg:
int[]arr ;

We have now declared a variable that holds an array of strings. To insert values to it, 
you can place the values in a comma-separated list, inside curly braces { }:

String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

*/

