package FibonacciNumber;
import java.util.Scanner;
/* 
 fibonacci series: 0 1 1 2 3 5 8 13 21 34..

class Fibonacci{
    static int n1=0,n2=1;
    public static void fibonacci(int getCount){
        System.out.print(n1+" "+n2);
        for(int i=0;i<=getCount;i++){
        int n3=n1+n2;
        System.out.print(" "+n3);
        n1=n2;//swap logic
        n2=n3;
       // return getCount;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Count");
        int count =sc.nextInt();
      
        
     if(count<0){
        System.out.println("count should not be negative");
     }
     else{
      fibonacci(count);
     }
        
    }
}
*/
/*
 But BiInteger is also good choice ,coz user
 may enter any type of values ,so it may go beyond the limit
 */
import java.math.BigInteger;
import java.util.Scanner;

class Fibonacci {

    // Use BigInteger for large Fibonacci numbers
    static BigInteger n1 = BigInteger.ZERO;
    static BigInteger n2 = BigInteger.ONE;

    public static void fibonacci(int getCount) {
        // Print the first two Fibonacci numbers
        System.out.print(n1 + " " + n2);

        for (int i = 2; i <= getCount; i++) {
            // Calculate the next Fibonacci number
            BigInteger n3 = n1.add(n2);
            System.out.print(" " + n3);

            // Update the values of n1 and n2
            n1 = n2;
            n2 = n3;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Count");
        int count = sc.nextInt();

      
        if (count < 0) {
            System.out.println("Count should be a non-negative integer.");
        } else {
            fibonacci(count);
        }
    }
}
