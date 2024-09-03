import java.util.Scanner;

public class EvenAndOddNum {
    public static void checkIfOddOrEvenNum(int num){
            if(num==0 || num%2==0){
                System.out.println("Number is even");
            }
            else{
                System.out.println("Number is Odd");
            }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
         if(num<0){
            System.out.println("Plz enter the positive number");
         }
         else{
            checkIfOddOrEvenNum(num);
         }

    }
}
