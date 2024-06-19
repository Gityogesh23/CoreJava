
import java.util.Scanner;
import java.math.BigInteger;

class Factorial{
    public static BigInteger fact(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    } 
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
   int  number=sc.nextInt();
      BigInteger factorial=fact(number);
        System.out.println("Factorial of number ="+factorial);
    }
   
    
}
