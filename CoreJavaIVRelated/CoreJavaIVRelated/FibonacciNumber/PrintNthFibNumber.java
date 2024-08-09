//package FibonacciNumber;
import java.util.Scanner;
public class PrintNthFibNumber {
    static int n1=0,n2=1;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numebr: ");
        int n=sc.nextInt();
        if(n<0){ //import tant to handle this negative number most programmers are forget to handle it.
            System.out.println("no shouldn't be negative:");
        } 
         
        else if(n1==0){System.out.print(" "+n1);}
        else if(n2==1){System.out.print(" "+n2);}

        int n3=0;
        for(int i=0;i<n;i++){
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
        sc.close();
      }
    }

