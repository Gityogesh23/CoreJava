import java.util.Scanner;
//swapping of two numbers using third variable

public class SwapTwoNum {
    public static void swapNum(int num1,int num2){
        int num3=num1;
        num1=num2;
        num2=num3;
        System.out.println("num1= " +num1+"\t"+"num= "+num2);
    }
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the numbers: ");
   int num1=sc.nextInt();
   int num2=sc.nextInt();
   swapNum(num1,num2);
}
}