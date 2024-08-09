
/*Factorial using Recursion :
Logic:
5!=5*4*3*2*1=120;
6!=720;
7!=5040 and so on.
//you can also used Bigint as int is having limit.

but what if negative value is given by user then==> go to line number 28:=>now my program is perfectly handled

*/
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
