import java.util.Scanner;
/*Factorial using Recursion :
Logic:
5!=5*4*3*2*1=120;
6!=720;
7!=5040 and so on.
//you can also used Bigint as int is having limit.

*/

public class Factorial {
    public static int fact(int num){
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
        int factorial=fact(count);
        System.out.println("factorial of " +" "+ count +" is :" +factorial);
        }
}
