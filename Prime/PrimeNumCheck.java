/*
prime number=>number>=2 and for(int i=2;;i<=Math.sqrt(number);i++)  
condition for prime number=> smaller prime number is 2 and if(number%2!=0)
we use logic for into the for loop=>for(int i=2;i<=Math.sqrt(number);i++{})

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
*/
/*program to check prime+palindrome +print reverse Array

@ Difference Between next() and nextLine()
next() → Reads a single token (word) until a space or newline is encountered.
nextLine() → Reads the entire line (including spaces) until the newline character (\n). 
 Problem with nextLine() After nextInt()
When nextInt() (or any numeric input) is used before nextLine(),
it does not consume the newline character (\n) left in the input buffer. 
This means when you call nextLine(), it immediately reads the leftover newline instead of waiting for actual input.
meaning=>sc.nextLine();  // Consume the leftover newline
String str = sc.nextLine();  // Now, it correctly reads the full line

Use next() if you only need a single word input.
✔ Use nextLine() with sc.nextLine(); before it if it's after nextInt() to avoid skipping input.

// Prime number input
System.out.println("Enter a number to check if it's prime:");
int num = sc.nextInt();
sc.nextLine();  // Clear the buffer

// String palindrome input
System.out.println("\nEnter a string to check if it's a palindrome:");
String str = sc.nextLine();  // Now works correctly for multi-word input

System.out.println("\nEnter a string to check if it's a palindrome:");
String str = sc.next();
next() is used because we're assuming a single word input like "madam", "racecar", etc.
If you enter multiple words (e.g., "hello world"), next() would only take "hello", ignoring "world".
When Should You Use nextLine()?
If we allow sentences (e.g., "Able was I saw Elba"), then nextLine() should be used:

java
Copy
Edit
String str = sc.nextLine();
However, if we do this right after nextInt(), there’s a potential issue due to how Scanner reads inputs.
*/
