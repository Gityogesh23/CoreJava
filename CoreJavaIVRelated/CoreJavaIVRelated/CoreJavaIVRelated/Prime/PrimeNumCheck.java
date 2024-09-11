import java.util.Scanner;

public class  PrimeNumCheck {
    public static void checkIfPrime(int num){
            if(num%2==0){
                System.out.println("number is prime");
            }
          else{
            System.out.println("number is not prime");
          }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number: ");
        int num= sc.nextInt();
        if (num<1){
            System.out.println("plz enter the positive number : ");

        }
        else{
        checkIfPrime(num);
        }
    }
}
