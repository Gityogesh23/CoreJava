//package CoreJava.IVCodes;
import java.util.Scanner;
public class Palindrome {
    static int number,temp,sum=0,remainder;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number want to check if palindrome or not  ");
        number=sc.nextInt();
        temp=number;
        while(number>0){
          remainder=number%10;
          sum=(sum*10)+remainder;
          number=number/10;
        }
        if(sum==temp)
        System.out.println("is palindrome");
        else
        System.out.println("Not Plaindrome");

    }
}
