//package Factorialnumber;

/*Factorial using Recursion :
Logic:1)

5!=5*4*3*2*1=120;
6!=720;
7!=5040 and so on.
//you can also used Bigint as int is having limit.

but what if negative value is given by user then==> go to line number 28:=>now my program is perfectly handled

*/

 
/*
import java.util.Scanner;
 class Factorial {
     static int fact(int num){
        if(num==0){
            return 1;
        }
         else{
                return num*fact(num-1);
            }
        }
    

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the count");
        int count=sc.nextInt();
        sc.close();
        if(count<0){
        System.out.println("Enter Positive number: ");
            return;
        }
        int factorial=fact(count);
        System.out.println("factorial of " +" "+ count +" is :" +factorial);
        }
}
*/
/* 
 //find Factorial==>Logic 2
import java.util.Scanner;
import java.math.BigInteger;
class Test{
    public static BigInteger fact(BigInteger num){
        if(num.equals(BigInteger.ZERO))
        return BigInteger.ONE;
        else
        return num.multiply(fact(num.subtract(BigInteger.ONE)));
    }
}
public class Factorial{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
          System.out.println("Enter the Number: ");
          BigInteger num=new BigInteger(sc.next());
          BigInteger factorialNum= Test.fact(num);
           System.out.println("Factorial of : "+num+ "is "+factorialNum );
           sc.close();
    }
}
*/
//Logic 3)
import java.util.Scanner;
 class Test{
        public static int fact(int number){
            //ternary operator
            return(number==0 || number==1) ? 1 : number *fact(number-1);
        } 
 }

 class Factorial
 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        if(num<0){
            System.out.println("Enter positive number only");
        }
        int result=Test.fact(num);
        System.out.println("Factorial of number : "+ num +" is "+result);
    }
 }
