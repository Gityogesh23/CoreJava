//finding an missing element from array.
import java.util.Scanner;
class FindingMissing{
    public static int findMissingElement(int[]arr){
        if(arr==null){
            throw new IllegalArgumentException("Array should not be empty.");
        }
        int n=arr.length+1;//ex=4;
        int expectedSum=n*(n+1)/2; //4*5/2=20/2=10
        int actualSum=0;
       for(int element:arr){
        actualSum+=element;
       }
        return expectedSum-actualSum;//gives missing number.
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array.");
        int size=sc.nextInt();
        int[]num=new int[size];
        System.out.println("Enter the array elements :");
        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
        }
        System.out.println("array contains following elements: ");
        for(int elements : num){
            System.out.println(elements);
        }
       int elementBecome=findMissingElement(num);
       System.out.println("missing element become : "+elementBecome);//missing element is here.
    }
}