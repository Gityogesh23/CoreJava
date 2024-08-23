
import java.util.Scanner;

//To swap three numbers without using fourth variables.
class Swap{
   
    
Swap(){} //constructor
public static void SwapNum(int a,int b,int c){
    c=a+b+c; //let values are: 1+    2+    3=>6 Expect:a=3,b=1,c=2
    a=c-(a+b);                        //6-(3)=> a=3 //achieved
    b=c-(a+b);                        //6-(5)=> b=1  //achieved
    c=c-(a+b);                         //6-(4)=>c=2 //achieved
    System.out.println("num1 ="+a+" "+"num2 ="+b+" "+"num3 ="+c);
}

}

public class SwapThreeWithoutFourth {
    public static void main(String[] args){
        int num1=0,num2=0,num3=0;//b'z they are local so should be initialized before use.
        Swap s1=new Swap();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers which you want to sort: ");
        for(int i=0;i<1;i++){
            System.out.print("num1= ");
            num1=sc.nextInt();
            System.out.print("num2= ");
            num2=sc.nextInt();
            System.out.print("num3= ");
            num3=sc.nextInt();
        }
       
        System.out.println();
        s1.SwapNum(num1,num2,num3);
        sc.close();
    }
   
}
