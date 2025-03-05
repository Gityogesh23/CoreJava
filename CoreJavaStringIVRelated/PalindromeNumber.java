 
/*
import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close(); // Close scanner after input
        
        if (isPalindrome(num)) {
            System.out.println(num + " is a Palindrome Number.");
        } else {
            System.out.println(num + " is NOT a Palindrome Number.");
        }
    }

    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;
        
        while (num > 0) {
            int digit = num % 10;  // Extract last digit
            reversedNum = reversedNum * 10 + digit; // Append to reversed number
            num /= 10; // Remove last digit from num
        }

        return originalNum == reversedNum; // Compare original with reversed
    }
}
 */
//start first with palindrome number check then go to fulfil next requirements
//logic is same =>just handling all special characters, spaces inside input 
//as we r handling it with above things then we should consider it as String then Convert it into integer.
import java.util.Scanner;

class PalindromeNumber{
    public static boolean isPalindrome(int number){
       int originalNum=number;
       int reversedNum=0;
       while(number>0){
        int digit=number%10;//121%10=>1
        reversedNum=reversedNum*10+digit;//0*10+1=>1
        number=number/10;//121/10=>12go to while repeat similar steps

       }    
       return originalNum==reversedNum;
    }
    

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String of number: ");
        int num=sc.nextInt();
        sc.close();

        if(isPalindrome(num)){
        System.out.println("The palindrome Number is: "+num);
    }
    else{
        System.out.println("The  Number is not palindrome ");
        }
    }
}