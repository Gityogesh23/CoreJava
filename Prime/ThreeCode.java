
import java.util.Scanner;
public class ThreeCode{
    
    // Check if a number is prime
    public static Boolean isPrime(int number) {
        if (number <= 1) {
            System.out.println("Give a valid number greater than 1");
            return false;
        }
        if (number == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {  // Fixed modulus operator
                return false;
            }
        }
        return true;
    }
    
    // Check if a string is a palindrome
    public static Boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    // Reverse an array
    public static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prime number check
        System.out.println("Enter a number to check if it's prime:");
        int num = sc.nextInt();
        boolean primeResult = isPrime(num);
        System.out.println(num + " is prime: " + primeResult);

        // Palindrome check
        System.out.println("\nEnter a string to check if it's a palindrome:");
        String str = sc.next();
        boolean palindromeResult = isPalindrome(str);
        System.out.println(str + " is a palindrome: " + palindromeResult);

        // Reverse array
        System.out.println("\nEnter the size of the array:");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        reverseArray(arr);
        
        System.out.println("Reversed array:");
        for (int numElement : arr) {
            System.out.print(numElement + " ");
        }
        sc.close();
    }
}
