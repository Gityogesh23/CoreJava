package ReverseNumber;
//package CoreJavaConcepts.ReverseNumber;
//we are going to reverse the number 
import java.util.Scanner;

public class ReverseNumber {

    public static void ReverseNum(int n){
        //logic
        if(n<10){
            System.out.println(n);
            return;
        }
        else{
            System.out.print(n%10);
            ReverseNum(n);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number=sc.nextInt();
        ReverseNum(number);
        
        }
    }

