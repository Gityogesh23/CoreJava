//package FibonacciNumber;
import java.util.Scanner;
public class SumOfNFibNumbers {

    public static int fibonacciSum(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 0;  // First Fibonacci number (0)

        int a = 0, b = 1, sum = 1; // Sum includes the first two Fibonacci numbers
        for (int i = 3; i <= n; i++) {
            int next = a + b;
            sum += next;
            a = b;
            b = next;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = scanner.nextInt();
        System.out.println("Sum of first " + n + " Fibonacci numbers: " + fibonacciSum(n));
        scanner.close();
    }
}
