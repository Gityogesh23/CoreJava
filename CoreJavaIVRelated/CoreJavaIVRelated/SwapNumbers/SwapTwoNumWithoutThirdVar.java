//package SwapNumbers;

/*
 Logic:( a=sum,b= sub,a=sub
        step1 :make a sum of both store into a
        step 2:make sub & store it into sec var2 i.e b
        step 3:make a sub & store it into var1 i.e a   
        )
 a=a+b;
 b=a-b;
 a=a-b;

 */
import java.util.Scanner;
public class SwapTwoNumWithoutThirdVar {
    public static void swap(int a,int b){
        a=a+b;//1+2=3
        b=a-b;//3-2=1 correctly swap initially a=1 ,b=2=>now become a=2
        a=a-b;//3-1=2 correctly swap initially a=1 ,b=2=>now become b=1
        System.out.println("a= "+a);
        System.out.println("b= "+b);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number a: "+" ");
        int a=sc.nextInt();
        System.out.print("Enter the number b: "+" ");
        int b=sc.nextInt();
        swap(a,b);
    }
}
