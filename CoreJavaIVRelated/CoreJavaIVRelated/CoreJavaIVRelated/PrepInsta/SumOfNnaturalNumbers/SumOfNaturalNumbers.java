/* To find the sum of n natural numners: 3 ways:
1)by for loop
2)Using Formula for the Sum of Nth Term
3)Using Recursion
*/
  /*
//1)using for loop
import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number: ");
        int n= sc.nextInt();
        int sum=0;
   
    for(int i=0;i<=n;i++){   //using for loop
           sum =sum+i;        
     }
       System.out.println("sum=  "+sum);  
        }       
}
    */    
   // 2) by formula
// System.out.println("sum ="+ n*(n+1)/2); //using formula to cl sum of N natural Numbers

//     }
// }
//3)by recursion
import java.util.Scanner;

public class SumOfNaturalNumbers {
  
    public static int getSum(int n){
        if(n==0)
        return 0;
        return n+getSum(n-1);
    }

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
System.out.println("Enter the natural number till which we want sum :");
   int n= sc.nextInt();
   if(n<0)
    System.out.println("Number is negative: plz Enter Positive number");
   int sum=0;
   int Result=getSum(n);
   System.out.println("sum of"+" "+n+" natural numbers is :"+Result);
    }
  }s
