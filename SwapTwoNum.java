import java.util.Scanner;



/* 
//Logic 2: show inIV's =>Swapping of two numbers without using third variable


public class SwapTwoNum {
    public static void swapNum(int num1,int num2){
        num1=num1+num2;//10+20=30
        num2=num1-num2;//30-20=10=>a assign to num2 here now to make num1=20 next line will be
        num1=num1-num2;//30-10=>20=>b successfully swapped.
        System.out.println("num1= " +num1+"\t"+"num= "+num2);
    }
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the numbers: ");
   int a=sc.nextInt();
   int b=sc.nextInt();
   swapNum(a,b);
}
}
*/


// logic 1=> swapping of two numbers using third variable

/* 
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

*/
//logic 3:with XOR operators=>

public class SwapTwoNum {
    public static void swapNum(int a,int b){
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("num1= " +a+"\t"+"num= "+b);
    }
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the numbers: ");
   int num1=sc.nextInt();
   int num2=sc.nextInt();
   swapNum(num1,num2);
}
}