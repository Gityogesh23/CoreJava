/* To find the sum of n natural numners: 3 ways:
1)by for loop
2)Using Formula for the Sum of Nth Term
3)Using Recursion
*/
//1)using for loop
import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number: ");
        int n= sc.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            sum =sum+i;
            System.out.println("sum=  "+sum);
     }
    
        }
       
        
}
