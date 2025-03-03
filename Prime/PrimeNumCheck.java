/*
prime number=>number>=2 and for(int i=2;;i<=Math.sqrt(number);i++)  
condition for prime number=> smaller prime number is 2 and if(number%2!=0)
we use logic for into the for loop=>for(int i=2;i<=Math.sqrt(number);i++{})
*/
import java.util.Scanner;
 class PrimeNumCheck{
public static void checkPrime(int number){
    if(number<=1){
        System.out.println("Not prime number ");
        return;
     }
            if(number==2){
                System.out.println("Is Prime");
                return;
            }
            for(int i=2;i<=Math.sqrt(number);i++){ 
                //eg 37=>6.08=>2,3,4,5,6  =>37 is not divisible by these numbers.
                //37 is only divisible by 37 and 1 itself hence its Prime Number.
               if(number%i==0) {
                System.out.println("Not  Prime");
                return ;
               }
            }
            System.out.println("Is Prime");
            
}

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
     System.out.println("Enter the Number: ");
     int num=sc.nextInt();
     
     checkPrime(num);
    }
 }