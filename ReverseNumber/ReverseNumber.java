
//package CoreJavaConcepts.ReverseNumber;
//we are going to reverse the number 

/*
import java.util.Scanner;

public class ReverseNumber{

    public static void ReverseNum(int n){
        //logic
        if(n<10){///print the unit digit of the given number
            System.out.println(n);
            return;
        }
        else{
            System.out.print(n%10);
            //calling function for remainig number other than unit digit.
            ReverseNum(n/10);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number=sc.nextInt();
        ReverseNum(number);
        
        }
    }
*/
//3)method 2)same by recursion 
import java.util.Scanner;

class reverseNumber{

    public static int ReverseNum(int num){
        int sum=0;//local var,need to initialize
        int temp=num;//this is my prev logic to reverse th number
        while(num>0){
            int remainder=num%10;
            sum=sum*10+remainder;
            
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numebr which we want to reverse: ");
        int number=sc.nextInt();
        if(number<0){
            System.out.println("Number should be positive");
            return;
        }
        else{
        System.out.println("The number reversed finally: "+ ReverseNum(number));
        }
    }
}
