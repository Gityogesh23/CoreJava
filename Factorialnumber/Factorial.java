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
        if(num==0 || num==1){
            return 1;
        }
         else{
                return num*fact(num-1);                                                 
//Backtracking works like this:
// fact(5)
//  └── fact(4)
//       └── fact(3)
//            └── fact(2)
//                 └── fact(1) → Base Case → Returns 1
//And then unwinds:
// fact(2) = 2 * 1 = 2 → Returns 2
// fact(3) = 3 * 2 = 6 → Returns 6
// fact(4) = 4 * 6 = 24 → Returns 24
// fact(5) = 5 * 24 = 120 → Returns 120 (Final Result)
//With backtracking approach function records are created at each function call
//so it become overhead for memory incase larger input size prog.

//always better to go with =>iterative Approach.=>refer next program of  logic 

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

//Logic 2:Iterative Approach:to find factorial of number//

//Logic2:Iterative Approach:to find factorial of number //


import java.util.Scanner;
class Factorial{
     public static int fact(int num){
        int result=1;
        for(int i=2;i<=num;i++){
            result*=i;//result=result*i;
        }    
        return result;
    }
     
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nummber: ");
        int number=sc.nextInt();
        if(number<0){
            System.out.println("Enter Valid Number: ");

        }
        int factorialOf=fact(number);
        System.out.println("The factorial of number is : "+" "+factorialOf);
    }
   }

/* 
 //find Factorial==>Logic 3
import java.util.Scanner;
import java.Math.BigInteger;
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

/* 
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
<<<<<<< HEAD

*/
/*
sudo wget -O /etc/apt/keyrings/jenkins-keyring.asc \
  https://pkg.jenkins.io/debian-stable/jenkins.io-2026.key
echo "deb [signed-by=/etc/apt/keyrings/jenkins-keyring.asc]" \
  https://pkg.jenkins.io/debian-stable binary/ | sudo tee \
  /etc/apt/sources.list.d/jenkins.list > /dev/null
sudo apt update
sudo apt install jenkins
*/